package com.exam.fd;

/** 
 * @ClassName AppMain  
 * @Description 程序入口类 
 * @author dingj 
 * @date 2018年7月16日  
 *   
 */
public class AppMain {

	/** 
	 * @Title: main 
	 * @Description: 程序入口 方法
	 * @param args 参数说明
	 * @return void    返回类型
	 */
	public static void main(String[] args) {
		
		AppManage appManage = new AppManage();
		/*long start = System.currentTimeMillis();
		System.out.println("1.给定用户的信用评分名次 start："+start);
		appManage.getRankByUserId("b9fc9c17-2c28-45a1-8f4c-1968d954c0f5");
		long end = System.currentTimeMillis();
//		System.out.println("给定用户的信用评分名次 end："+end);
		System.out.println("给定用户的信用评分名次 程序耗时"+(end-start)/1000+" 秒");*/
		
		long start = System.currentTimeMillis();
		System.out.println("2.Top 100 的信用评分的用户 start："+start);
//		appManage.getUserIdByScore();
		long end = System.currentTimeMillis();
//		System.out.println("Top 100 的信用评分的用户 end："+end);
		System.out.println("Top 100 的信用评分的用户  程序耗时"+(end-start)/1000+" 秒");
		
		/*long start = System.currentTimeMillis();
		System.out.println("3.信用评分重复次数最高的10个信用评分 start："+start);
		appManage.getScoreByCount();
		long end = System.currentTimeMillis();
//		System.out.println("信用评分重复次数最高的10个信用评分end："+end);
		System.out.println("信用评分重复次数最高的10个信用评分 程序耗时"+(end-start)/1000+" 秒");*/
		

	}

}
