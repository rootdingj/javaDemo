package com.jdbc.day2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.day1.DBUtil;

public class BatchTest {

	public static void batchState(){
		Connection conn = DBUtil.getConn();
		Statement stm = null;
		try {
			stm = conn.createStatement();
			long start = System.currentTimeMillis();
			System.out.println("录入数据开始....");
			int temp = 0;
			for(int i=1;i<=1000;i++){
				temp++;
				String sql = "insert into jdbc_user values("+i+",'"+"lisi"+i+"',"+i+")";
				stm.addBatch(sql);
				if(i%100!=0){
					int[] batch = stm.executeBatch();
					System.out.println("当前是第"+temp+"次录入"+batch.length+"条数据");
				}
				System.out.println("一大波数据来袭..."+i);
			}
			System.out.println("录入数据结束...");
			long end = System.currentTimeMillis();
			System.out.println(end-start);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void batchPrep(){
		Connection conn = DBUtil.getConn();
		PreparedStatement pstm = null;
		String sql = "insert into jdbc_user values(?,?,?)";
		
		try {
			pstm = conn.prepareStatement(sql);
			long start = System.currentTimeMillis();
			System.out.println("录入数据开始...");
			int temp = 0;
			for(int i=1;i<1000;i++){
				temp++;
				pstm.setLong(1, i);
				pstm.setString(2, "lisi"+i);
				pstm.setInt(3, i);
				pstm.addBatch();
				if(i%100!=0){
					int[] batch = pstm.executeBatch();
					System.out.println("当前是第"+temp+"次录入"+batch.length+"条数据");
				}
				System.out.println("一大波数据来袭...");
			}
			System.out.println("全部输出来了哇...");
			long end = System.currentTimeMillis();
			System.out.println(end-start);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		BatchTest.batchState();
//		BatchTest.batchPrep();
	}
}
