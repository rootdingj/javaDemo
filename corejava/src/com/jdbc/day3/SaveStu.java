package com.jdbc.day3;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbc.day1.DBUtil;

//用这个原理就引出了hibernate框架的概念
public class SaveStu {

	public static void saveStudent(Student stu){
		try {
			DBUtil.getConn().createStatement().execute("create table stu("
																		+ "id number(10),"
																		+ "name varchar2(12))");
			PreparedStatement pstm = 
					DBUtil.getConn().prepareStatement("insert into stu values(?,?)");
			pstm.setLong(1, stu.getId());
			pstm.setString(2, stu.getName());
			pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		Student stu = new Student(1, "hqr");
		SaveStu.saveStudent(stu);
	}
}
