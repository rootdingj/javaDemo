package com.jdbc.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Test1_JDBC {
	private static Connection conn;
	private static String url;
	private static String user;
	private static String password;
	public static PreparedStatement pstm;
	public static Statement stm;
	public static ResultSet rs;
	static{
		Properties prop = new Properties();
		try {
			prop.load(Test1_JDBC.class.getResourceAsStream("db.properties"));
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
	public static void shutdown(ResultSet rs,Statement stm,PreparedStatement pstm,Connection conn){
		try {
			if(rs!=null)rs.close();
			if(stm!=null)stm.close();
			if(pstm!=null)pstm.close();
			if(conn!=null)conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		try {
			pstm = 
					conn.prepareStatement("insert into jdbc_user(id,name,age) values(?,?,?)");
			for(int i=5;i<10;i++){
				pstm.setLong(1, i);
				pstm.setString(2, "hqr"+i);
				pstm.setInt(3, 2+i);
				pstm.executeUpdate();
			}
			stm = conn.createStatement();
			String sql1 = "update jdbc_user set name ='IBM' where id = 2";
			String sql2 = "delete from jdbc_user where id = 5";
			String sql3 = "select * from jdbc_user";
		    stm.execute(sql1);
			stm.execute(sql2);
		    rs = stm.executeQuery(sql3);
			while(rs.next()){
				System.out.println("IDΪ:"+rs.getLong(1));
				System.out.println("nameΪ:"+rs.getString(2));
				System.out.println("ageΪ:"+rs.getInt(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Test1_JDBC.shutdown(rs, stm, pstm, conn);
	}
}
