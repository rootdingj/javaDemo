package com.dj.ch08.lx_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StringCount {
	public static void main(String[] args) {
		
		String str = "dsfasdgfasdfafdsdfasdf";
		
		//方法一、ArrayList实现
		ArrayList data = new ArrayList();  //List确保顺序的不变，data用来存放去重后的数据
		for(int i=0;i<str.length();i++){
			String s = str.substring(i,i+1);	//返回i到 i+1-1的字符
			if(!data.contains(s)){		//集合中没有这个元素就添加
				data.add(s);
			}
		}
		for(Object o:data){
			System.out.println(o);
		}
		System.out.println("..............");
		
		//方法二、HashMap
		Map<String, Integer> map = new HashMap<String,Integer>();
		for(int i=0;i<str.length();i++){
			String s = str.substring(i,i+1);
			if(!map.containsKey(s)){
				map.put(s, 1);
			}else{
				map.put(s, map.get(s)+1);  //相同键的个数+1，去重并且计算重复字母的个数
			}
		}
		
		Set entrySet = map.entrySet();
		Iterator it = entrySet.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
