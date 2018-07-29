package com.dj.ch10;

public class ExceptionTest7 {
	
	public static void main(String[] args) {
		//运行时异常
		String s = null;
		if(s!=null){
			System.out.println(s.trim());
		}
		
		//编译时异常
		try {
			Class.forName("com1.briup.ch07.ExceptionTest7");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void test()throws ClassNotFoundException,ArithmeticException,NoSuchFieldException{
		
	}
	
	
	
}
