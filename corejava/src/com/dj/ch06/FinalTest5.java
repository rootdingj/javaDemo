package com.dj.ch06;

public class FinalTest5{
	
	public void test(final int a){
		System.out.println(a);
		//a = 10;
		final String s = "test";
		//s = "tom";
		System.out.println(s);
	}

	public static void main(String[] args){
		
		//System.out.println("");
		FinalTest5 f = new FinalTest5();
		f.test(1);
		f.test(2);
	}

}