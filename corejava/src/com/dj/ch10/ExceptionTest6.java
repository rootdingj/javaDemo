package com.dj.ch10;

public class ExceptionTest6 {
	
	public static void main(String[] args) {
		
		System.out.println("hello1");
		System.out.println("hello2");
		System.out.println("hello3");
		
		ExceptionTest6 t = new ExceptionTest6();
		
		/*try {
			t.test();
		} catch (ClassNotFoundException | ArithmeticException | NoSuchFieldException e) {
			e.printStackTrace();
		}*/
		
		try {
			t.test();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("hello4");
		System.out.println("hello5");
		System.out.println("hello6");
		
		
	}
	
	public void test()throws ClassNotFoundException,ArithmeticException,NoSuchFieldException{
		
		/*try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}*/
		
		Class.forName("");
		
	}
}
