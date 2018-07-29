package com.dj.ch06;

public class StaticTest2 {
	private static String name;
	public static int age;
	private int a;
	public int b;
	
	public void test(){
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

	public static void run(){
	}
	public static void main(String[] args){
		//System.out.println(a);
		//System.out.println(b);
		StaticTest2 t = new StaticTest2();
		System.out.println(name);
		System.out.println(age);
		System.out.println(StaticTest2.name);
		System.out.println(StaticTest2.age);
		System.out.println(t.age);
		System.out.println(t.name);
		StaticTest2.run();

		//System.out.println(this);
	}
}

class A{
	public static void main(String[] args){
		System.out.println(StaticTest2.age);
		//System.out.println(StaticTest2.name);false
		StaticTest2 t = new StaticTest2();
		System.out.println(t.age);
	}
}

