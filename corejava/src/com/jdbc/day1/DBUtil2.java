package com.jdbc.day1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBUtil2 {

	private static Connection conn;
	private static String url;
	private static String user;
	private static String password;
	
	static{
		Properties prop = new Properties();
		try {
			prop.load(DBUtil2.class.getResourceAsStream("config.properties"));
			Class.forName(prop.getProperty("driver"));
			url = prop.getProperty("url");
			user = prop.getProperty("user");
			password = prop.getProperty("password");
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConn(){
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
		
	System.out.println(DBUtil2.getConn());
	}
}
