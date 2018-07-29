package com.dj.ch07;

public class StudentTest2 {
	public static void main(String[] args) {
		Student s = new Student(1L, "tom");
		//s = null;
		System.out.println(s);
		System.out.println(s.toString());
		
		Object o = new Object();
		System.out.println(o.getClass());
		o = new Student(12L, "");
		System.out.println(o.getClass());
		long l = 1;
		Long L = null;
		
	}
}
