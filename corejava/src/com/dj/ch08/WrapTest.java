package com.dj.ch08;

public class WrapTest {
	public static void main(String[] args) {
		String a = "1";
		Integer i = new Integer(a);
		
		//自动装箱，jdk1.5以后才有的新特性
		Integer t = 1;
		//自动拆箱
		int t2 = t;
		String b = 1+"";	//把整型变成字符串
		Integer.parseInt(a); //解析，把字符串变回整型数
		
		WrapTest w = new WrapTest();
		Integer ii = new Integer(1);
		w.test(ii);
		w.test(1L);
		w.test(1);
	}
	//数据类型的转换，显示、隐式、拆箱、装箱：理清 数据类型的转换、和基本数据类型包装类（类）两个概念就没问题了
//	public void test(Object o){
//		System.out.println("1");
//	}
//	public void test(int i){
//		System.out.println("2");
//	}
	public void test(long l){
		System.out.println("3");
	}
	public void test(Long L){
		System.out.println("4");
	}
	
	
}
