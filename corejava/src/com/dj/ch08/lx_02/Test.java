package com.dj.ch08.lx_02;

public class Test {
	public static void a(String str){
		 str = "nihao";
	}
	public static String b(String str){
		return str = "nihao";
	}
	public static void main(String[] args) {
		String str = "hello";
		a(str);	
		System.out.println(str); 	//hello
		System.out.println(b(str)); //nihao
	}
}
//输出hello
/*String 分配的内存在方法区，不会变
 * 当JVM从main()中运行到String ----hello,分配内存空间存放hello，不会改变，并将地址指向str
 *程序调用 静态方法a(),给str赋值的时候，JVM会把“nihao”和方法区中的内容匹配，如果没找到“nihao”这个内容，
 *就给“nihao”分配一块新的内存存放，如果找到了，就把“nihao”的地址指向新的引用
 * */
