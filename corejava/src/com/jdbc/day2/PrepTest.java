package com.jdbc.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrepTest {
	
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "dj";
		String password = "dj";
		Connection conn = null;
		Statement stm = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			try {
				conn = DriverManager.getConnection(url, user, password);
				stm = conn.createStatement();
				String sql = "select * from jdbc_user";
//				String sql2 = "insert into jdbc_user(id,name,age) values(01114,'xiaohan',27)";
//				stm.executeUpdate(sql2);
				for(int i=1;i<5;i++){
					
					String sql3 = "insert into jdbc_user(id,name,age) values("+i+","+"'zhangsan'+i"+i+")";
					stm.executeUpdate(sql3);
				}
			    rs = stm.executeQuery(sql);
				while(rs.next()){
					System.out.println("IDΪ:"+rs.getLong(1));
					System.out.println("nameΪ:"+rs.getString(2));
					System.out.println("ageΪ:"+rs.getInt(3));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				if(rs!=null)rs.close();
				if(stm!=null)stm.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
	}
}
