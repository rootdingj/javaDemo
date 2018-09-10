package com.exam.fd;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.exam.util.PropertiesUtil;

public class FdExamService {
	
	/** 
	 * @Title: getIdByReadCVS 
	 * @Description: 获取当前用户ID的序号和分数
	 * @param userId
	 * @return 参数说明
	 * @return Map<Integer,Integer>    返回类型
	 */
	public Map<Integer,Integer> getIdByReadCVS(String userId){
		BufferedReader reader = null;
		String line = null;  
		int count = 0;
		int rankScore = 0;
		try {
			reader = new BufferedReader(new FileReader(PropertiesUtil.getValue("readFilePath")));
            while((line=reader.readLine())!=null){  
            	count++;
            	//CSV格式文件为逗号分隔符文件，这里根据逗号切分 
                String item[] = line.split(",");
                int score = Integer.parseInt(item[1]);
                if(userId.equals(item[0])) {
                	// 暂存 score
                	rankScore = score; 
                	break;
                }
            }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(count,rankScore);
		return map;
	}
	
	/**
	* 实时排序，保存Top 100信用评分的用户信息
	* @param map
	* @return
	*/
	public Map<String, Integer> sortMapTop100(Map<String, Integer> oriMap) {
		if (oriMap == null || oriMap.isEmpty()) {
			return null;
		}
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		List<Map.Entry<String, Integer>> entryList = new ArrayList<Map.Entry<String, Integer>>(
				oriMap.entrySet());
		// 降序排列
		Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return -(o1.getValue() - o2.getValue());
			}
		});
		/*for (Map.Entry<String, Integer> entry : entryList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		*/
		int temp =0;
		for (Map.Entry<String, Integer> entry : entryList) {
			temp++;
			if(temp <= 100){
				sortedMap.put(entry.getKey(), entry.getValue());
			}
		}
		return sortedMap;
	}
	
	/** 
	 * @Title: getUserIdByScoreTop100 
	 * @Description: Top 100 的信用评分的用户   参数说明
	 * @return void    返回类型
	 */
	public void getUserIdByScoreTop100(Map<String, Integer> map){
		int sum = 1;
		System.out.println("--------- Top 100 的信用评分的用户  start ----------");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("userId=" + entry.getKey() + " score=" + entry.getValue());
			sum++;
			if(sum>100){
				break;
			}
		}
		System.out.println("--------- Top 100 的信用评分的用户  end ----------");
		
	}
	
	/** 
	 * @Title: getScoreByCount 
	 * @Description: 信用评分重复次数最高的10个信用评分
	 * @param tree
	 * @param node 参数说明
	 * @return void    返回类型
	 */
	public void getScoreByCount(AVLTree tree,Node node){
		Map<String, Integer> map = new LinkedHashMap<String, Integer>(16);
		map = tree.postOrderTraversal(node, map);
		int sum = 1;
		System.out.println("--------- 信用评分重复次数最高的10个信用评分 start ----------");
		System.out.print("重复次数最高的10个信用评分为：");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.print("score="+entry.getKey()+",count"+entry.getValue());
			sum++;
			if(sum>10){
				break;
			}
			System.out.print(", ");
		}
		System.out.println();
		System.out.println("--------- 信用评分重复次数最高的10个信用评分 end ----------");
	}
	
	/** 
	 * @Title: init 初始化
	 * @Description:  
	 * @param userId
	 * @return 参数说明
	 * @return int    返回类型
	 */
	public void init(String userId){
		int sum =0;
		int rankScore =0;
		int count = 0;
		int temp = 0;
		AVLTree tree = new AVLTree();
		Node node = new Node();
		node = tree.createTree(node, 999999, 0);
		Map<Integer, Integer> map2 = getIdByReadCVS(userId);
		for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
			sum = entry.getKey();
			rankScore = entry.getValue();
		}
		BufferedReader reader = null;
		Map<String, Integer> oriMap = new LinkedHashMap<String, Integer>();
		Map<String, Integer> sortMap = new HashMap<String, Integer>();
		try {
			reader = new BufferedReader(new FileReader(PropertiesUtil.getValue("readFilePath")));
			String line = null;  
            while((line=reader.readLine())!=null){  
            	count++;
                String item[] = line.split(",");
                String uid = item[0];
                int score = Integer.parseInt(item[1]);
                tree.addNewScore(node, score);
                if(count<sum&&score==rankScore){
                	temp++;
                }
                oriMap.put(uid, score); 
                sortMap = sortMapTop100(oriMap);
                
            }
            // 第一题
            int rank = tree.getRank(node,rankScore,1);
            rank += temp; 
            System.out.println(userId+" 的排名为： "+rank);
            // 第二题
            getUserIdByScoreTop100(sortMap);
            // 第三题
            getScoreByCount(tree, node);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new FdExamService().init("b9fc9c17-2c28-45a1-8f4c-1968d954c0f5");
	}

}
