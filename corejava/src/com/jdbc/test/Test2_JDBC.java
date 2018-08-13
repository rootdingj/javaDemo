package com.jdbc.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Properties;

public class Test2_JDBC {
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
			prop.load(Test2_JDBC.class.getResourceAsStream("db.properties"));
			//1.
			Class.forName(prop.getProperty("driver"));
			//2.s
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
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String sql = " create table teacher("
				+ "id	number(10)	primary key,"
				+ "name	varchar2(20),"
				+ "birthday date,"
				+ "salary	number(10,2) )";
		String sql2 = "insert into teacher values(?,?,?,?)";
		try {
			//3
			 stm = conn.createStatement();
			 stm.execute(sql);
			 pstm = conn.prepareStatement(sql2);
			 for(int i=1;i<11;i++){
				 pstm.setLong(1, 111111+i);
				 pstm.setString(2, "lisi"+i);
/*				 pstm.setTimestamp(3, new Timestamp(
						 new java.util.Date().getYear(), 
						 new java.util.Date().getMonth(),
						 new java.util.Date().getDay(),
						 new java.util.Date().getHours(),
						 new java.util.Date().getMinutes(), 
						 new java.util.Date().getMinutes(),
						 new java.util.Date().getSeconds()));*/
//				 pstm.setTimestamp(3, new Timestamp(new java.util.Date().getTime()));
				 pstm.setDate(3, new java.sql.Date(new java.util.Date().getTime()));
				 pstm.setDouble(4, 222222+i);
				 pstm.executeUpdate();
			 }
			ResultSet rs1 = stm.executeQuery("update teacher set salary=salary+200 where id>0");
			//4
			rs = stm.executeQuery("select * from teacher");
			//5
			while(rs.next()){
				System.out.println(rs.getLong(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getDate(3));
				System.out.println(rs.getDouble(4));
			}
			/*ResultSetMetaData meta = rs.getMetaData();
			System.out.println("查询数据的行数:"+meta.getColumnCount());
			stm.execute("delete from teacher");
			System.out.println("删除表中所有数据...");
			if(meta.getColumnCount()==0){
				System.out.println("删除成功！");
			}else{
				System.out.println("删除不成功");
			}
			stm.execute("drop table teacher");
			System.out.println("删除teacher表对象");*/
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//6
		Test2_JDBC.shutdown(rs, stm, pstm, conn);
	}
}
