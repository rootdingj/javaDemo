package com.dj.ch10;

public class ExceptionTest9 {
	
	public static void main(String[] args) {
		
		ExceptionTest9 t = new ExceptionTest9();
		
		try {
			t.test();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
	
	public void test()throws MyException{
		int a = 10;
		int b = 20;
		if(a+b>25){
//			throw new Exception("a加b不能大于25");
//			throw new MyException("a加b不能大于25");
			throw new MyException();
		}
		System.out.println(a+b);
	}
	
}
