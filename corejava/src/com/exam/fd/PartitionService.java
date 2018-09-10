package com.exam.fd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class PartitionService {
	private String inPath = "D:\\user_score.csv";
//	private String inPath = "D:\\user_score_in.csv";
	private String outPath = "D:\\user_score_out.csv";
	private String outPath1 = "D:\\user\\user1.csv"; 
	private String outPath2 = "D:\\user\\user2.csv";
	private String outPath3 = "D:\\user\\user3.csv";
	private String outPath4 = "D:\\user\\user4.csv";
	private String outPath5 = "D:\\user\\user5.csv";
	private String outPath6 = "D:\\user\\user6.csv";
	private String outPath7 = "D:\\user\\user7.csv";
	private String outPath8 = "D:\\user\\user8.csv";
	private String outPath9 = "D:\\user\\user9.csv";
	private String outPath10 = "D:\\user\\user10.csv";

	public void splitFile(){
		BufferedReader reader = null;
		BufferedWriter writer1 = null;
		BufferedWriter writer2 = null;
		BufferedWriter writer3 = null;
		BufferedWriter writer4 = null;
		BufferedWriter writer5 = null;
		BufferedWriter writer6 = null;
		BufferedWriter writer7 = null;
		BufferedWriter writer8 = null;
		BufferedWriter writer9 = null;
		BufferedWriter writer10 = null;
		try {
			reader = new BufferedReader(new FileReader(inPath));
			writer1 = new BufferedWriter(new FileWriter(outPath1));
			writer2 = new BufferedWriter(new FileWriter(outPath2));
			writer3 = new BufferedWriter(new FileWriter(outPath3));
			writer4 = new BufferedWriter(new FileWriter(outPath4));
			writer5 = new BufferedWriter(new FileWriter(outPath5));
			writer6 = new BufferedWriter(new FileWriter(outPath6));
			writer7 = new BufferedWriter(new FileWriter(outPath7));
			writer8 = new BufferedWriter(new FileWriter(outPath8));
			writer9 = new BufferedWriter(new FileWriter(outPath9));
			writer10 = new BufferedWriter(new FileWriter(outPath10));
			String line = null;  
	        while((line=reader.readLine())!=null){  
	        	//CSV格式文件为逗号分隔符文件，这里根据逗号切分 
	            String item[] = line.split(",");
//	            String  userId = item[0];
	            String score = item[1];
	            if(score.length() < 6) {
	            	writer1.write(line);
	            	writer1.newLine();
	            	writer1.flush();
	            }else {
	            	int index=score.charAt(0); 
	            	switch (index) {
						case 49:{
							writer2.write(line);
							writer2.newLine();
							writer2.flush();
							break;
						}
						case 50:{
							writer3.write(line);
							writer3.newLine();
							writer3.flush();
							break;
						}
						case 51:{
							writer4.write(line);
							writer4.newLine();
							writer4.flush();
							break;
						}
						case 52:{
							writer5.write(line);
							writer5.newLine();
							writer5.flush();
							break;
						}
						case 53:{
							writer6.write(line);
							writer6.newLine();
							writer6.flush();
							break;
						}
						case 54:{
							writer7.write(line);
							writer7.newLine();
							writer7.flush();
							break;
						}
						case 55:{
							writer8.write(line);
							writer8.newLine();
							writer8.flush();
							break;
						}
						case 56:{
							writer9.write(line);
							writer9.newLine();
							writer9.flush();
							break;
						}
						default:{
							writer10.write(line);
							writer10.newLine();
							writer10.flush();
							break;
						}
					}
	            }
	        }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (reader != null) {
					reader.close();
				}
				if (writer1 != null) {
					writer1.close();
				}
				if (writer2 != null) {
					writer2.close();
				}
				if (writer3 != null) {
					writer3.close();
				}
				if (writer4 != null) {
					writer4.close();
				}
				if (writer5 != null) {
					writer5.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		String []inPaths = {
				"D:\\user\\user1.csv",
				"D:\\user\\user2.csv",
				"D:\\user\\user3.csv",
				"D:\\user\\user4.csv",
				"D:\\user\\user5.csv",
				"D:\\user\\user6.csv",
				"D:\\user\\user7.csv",
				"D:\\user\\user8.csv",
				"D:\\user\\user9.csv",
				"D:\\user\\user10.csv"
		};
		for(String inPath:inPaths) {
			mergeFile(inPath);
		}
	}
	
	public void mergeFile(String inPath){
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try {
			reader = new BufferedReader(new FileReader(inPath));
			writer = new BufferedWriter(new FileWriter(outPath,true));
			String line = null;  
			List<User> list = new ArrayList(88);
			while((line=reader.readLine())!=null){  
				//CSV格式文件为逗号分隔符文件，这里根据逗号切分 
				String item[] = line.split(",");
				String  userId = item[0];
				int score = Integer.parseInt(item[1]);
				list.add(new User(userId, score));
			}
//        	list = SortUtil.sortList(list);
        	for (User user : list) {
				writer.write(user.getUserId()+","+user.getScore());
				writer.newLine();
				writer.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (reader != null) {
					reader.close();
				}
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		PartitionService service = new PartitionService();
		long start = System.currentTimeMillis();
		System.out.println("start:"+start);
		service.splitFile();
//		service.mergeFile("D:\\user_score_in.csv");
//		service.mergeFile("D:\\user\\user1.csv");
		long end = System.currentTimeMillis();
//		System.out.println("耗时："+(end-start));
		System.out.println("耗时："+(end-start)/1000);
	}

}
