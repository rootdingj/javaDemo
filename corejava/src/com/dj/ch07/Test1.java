package com.dj.ch07;

public class Test1 {
	public static void main(String[] args) {
		
		/*String类型变量赋值；如果“=”右边是包含变量的元素，那么不会去常量池里边
		去找元素，如果“=”右边是常量那么就会去常量池去找与它相等的元素；*/
		
		String c = "c";		//左边的是变量，右边的是常量
		String b = "a"+c+"b";	//常量+变量=变量，在编译时不会给他分配常量内存区，而是变量内存区
		String a = "a"+c+"b";
		String e = "a"+"b";
		String f = "a"+"b";
		System.out.println(b==c);//false
		System.out.println(e==f);//ture
		Test1 t = new Test1();
	}

	
}
