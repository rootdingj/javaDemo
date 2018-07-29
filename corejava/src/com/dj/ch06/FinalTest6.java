package com.dj.ch06;

public class FinalTest6{
	
	public void test(){
		final Student s = new Student();	
		s.name = "zs";
		s.name = "lisi";
		//s = new Student();
	}
	public static void main(String[] args){
		
		//System.out.println("");
	}
}

class Student{
	public String name;
	public void go(){
	
	}
}
