package com.source.plong;

import java.util.Calendar;
import java.util.Date;

public class ObjectCloneTest {
	public static final int NUM = 100000;
	
	@SuppressWarnings("unused")
	public static void cloneTest1() {
		 final Date date = new Date();
		 {
			 long startTime1 = System.currentTimeMillis();
			 for (int i = 0; i < NUM; i++) {
				 final Date date2 = (Date) date.clone();
			 }
			 long endTime1 = System.currentTimeMillis();
			 System.out.println("clone:" + (endTime1 - startTime1) + "ms"); // 9ms
		 }
		 
		 {
			 long startTime2 = System.currentTimeMillis();
			 for (int i = 0; i < NUM; i++) {
				 final Calendar cal = Calendar.getInstance();
				 cal.setTime(date);
				 final Date date2 = cal.getTime();
			 }
			 long endTime2 = System.currentTimeMillis();
			 System.out.println("clone:" + (endTime2 - startTime2) + "ms"); // 219ms
		 }
		/*
		 * 结论：1.获取实例，clone()速度要快于getInstance()
		 * 	   2.一般native方法比java中非native方法执行效率高
		 * */
		
	} 

	public static void cloneTest2() {
		Student stu1 = new Student("lq", 27);
		Student stu2 = stu1.clone();
		System.out.println(stu1.getName() == stu2.getName() ? "浅复制" : "深复制");
		
	}
	
	public static void main(String[] args) {
//		cloneTest1();
		cloneTest2();
	}

}

class Student implements Cloneable {
	String name;
	int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student clone() {
		Student s = null;
		try {
			s = (Student)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return s;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

