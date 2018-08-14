package com.jdbc.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FirstJDBC {
	
	public static void main(String[] args) {
		//"jdbc技术:厂商:子协议：@地址：端口：数据库版本(xe:oracle简化版,orcl完整版)"
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "dj";
		String password = "dj";
		Connection conn = null;
		Statement stm = null;
		ResultSet rs = null;
		PreparedStatement pstm = null;
		
		try {
			//1、注册驱动(oracle驱动) 
			/*OracleDriver:ojdbc14.jar中的一个类,这一类类由jdbc使用，不由程序员使用;
			 * 当你的程序中明确使用其中的某个类时，会被JVM自动加载;
			 * 但是在程序中不显示的使用驱动程序类,因此，必须编写代码告诉JVM加载他们
			 * */
			Class.forName("oracle.jdbc.OracleDriver");
			//2、建立数据库连接
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);
			//3、创建语句
			//预编译
/*			pstm = conn.prepareStatement("insert into s_region(id,name) values(?,?)");
			for(int i=25;i<30;i++){
				pstm.setLong(1,100+i);
				pstm.setString(2, "朝鲜"+121);
				pstm.executeUpdate(); 
			}*/
			stm = conn.createStatement();
			//4、执行语句
			String sql = "select id,name from s_region";
			rs = stm.executeQuery(sql);
			stm.execute(sql);
			stm.execute("insert into s_region values(11,'中国')");
//			stm.executeUpdate("create table temp1(col1 number(12),clo2 varchar2(20))");
			//5、处理结果集
			while(rs.next()){
				System.out.println("ID为:"+rs.getLong(1));
				System.out.println("名字为:"+rs.getString(2));
				System.out.println();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				//6、关闭JDBC对象(顺序反着来)
				if(rs!=null)rs.close();
				if(stm!=null)stm.close();
				if(pstm!=null)pstm.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
