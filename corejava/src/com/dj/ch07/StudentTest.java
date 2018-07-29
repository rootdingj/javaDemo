package com.dj.ch07;

public class StudentTest {
		public static void main(String[] args) {
			
			//== equals
			int a = 10;
			int b = 20;
			System.out.println(a==b);
			Student s1 = new Student(1L,"dj1");
			Student s2 = new Student(2L,"dj2");
			System.out.println(s1==s2);
			String str1 = "hello";
			String str2 = "hello";
			System.out.println(str1==str2);  //比较的是变量中的值
			String str3 = new String("hello");
			String str4 = new String("hello");
			System.out.println(str3==str4);	//变量中的值是new出来对象的地址
			System.out.println(str3.equals(str4));	//比较的是他们的内容
			
		}
}
