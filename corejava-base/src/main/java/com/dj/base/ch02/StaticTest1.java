package com.dj.base.ch02;
import static java.lang.System.out;

public class StaticTest1 {
	private static String name;
	public static int age;
	private int a;
	public int b;

	public void test() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(name);
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(this.name);
		run();
		this.run();
		System.out.println(this);
	}

	public static void run() {
	}
	
	public void staticImportTest(){
		System.out.println("hello");
		out.println("hello");
	}

	public static void main(String[] args) {
		// System.out.println(a);
		// System.out.println(b);
		StaticTest1 t = new StaticTest1();
		System.out.println(name);
		System.out.println(age);
		System.out.println(StaticTest1.name);
		System.out.println(StaticTest1.age);
		System.out.println(t.age);
		System.out.println(t.name);
		StaticTest1.run();
		// System.out.println(this);
	}

}
