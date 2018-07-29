package com.dj.ch06;

public class StaticTest {

	private String name="dj";
	private static int age;
	public static void test1(){
		System.out.println("aaaaaaaaaaaaa");
	}
	
	public static void main(String[] args) {
		StaticTest t = new StaticTest();
		System.out.println(t.name);
		System.out.println(age);
		System.out.println(StaticTest.age);
		test1();
		StaticTest.test1();
	}
	
}
