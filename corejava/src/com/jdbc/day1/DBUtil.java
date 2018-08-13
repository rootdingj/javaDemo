package com.jdbc.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

@SuppressWarnings("unused")
public class DBUtil {

	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String user ;
	private static String password;
	
	public static Connection getConn(){
		Connection conn = null;
		Statement stm = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Properties info = new Properties();
			info.setProperty("user", "dj");
			info.setProperty("password"," dj");
			conn = DriverManager.getConnection(url, info);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void shutdown(ResultSet rs,Statement stm,Connection conn){
		try {
			if(rs!=null)rs.close();
			if(stm!=null)stm.close();
			if(conn!=null)conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println("............"+DBUtil.getConn());
	}
}
