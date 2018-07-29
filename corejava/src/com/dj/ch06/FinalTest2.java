package com.dj.ch06;

public class FinalTest2{
	
	public final void test(){
	
	}
	public static void say(){
		System.out.println("a");
	}
	
	public static final void go(){
		System.out.println("c");
	}

	public static void main(String[] args){
		
		//System.out.println("");
		FinalTest2 f = new C();
		f.say();
	}
}

class C extends FinalTest2{
	public void test1(){
		test();	
	}
	public static void say(){
		System.out.println("b");
	}
}


