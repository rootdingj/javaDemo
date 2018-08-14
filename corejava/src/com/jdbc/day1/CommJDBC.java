package com.jdbc.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class CommJDBC {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "dj";
		String password = "dj";
		Connection conn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			//1、加载驱动程序(oracle驱动) 
				//1
//			Class.forName("oracle.jdbc.OracleDriver");
				//2
			OracleDriver driver = new OracleDriver();
			DriverManager.registerDriver(driver);
				//3、VM arguments
			//-D:系统运行变量
			//-Djdbc.drivers=oracle.jdbc.OracleDriver
				//4、使用高版本的jdbc
			//2、建立连接
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);
			//3、创建语句
			stm = conn.createStatement();
			System.out.println(stm);
			//4、执行语句
			String sql1 = "select sysdate from s_region";
			rs = stm.executeQuery(sql1);
			System.out.println("------------"+stm.executeUpdate(sql1));
			//5、处理结果集
			while(rs.next()){
				System.out.println("..............."+rs.getDate(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				//6、关闭(顺序反着来)
				if(rs!=null)rs.close();
				if(stm!=null)stm.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
