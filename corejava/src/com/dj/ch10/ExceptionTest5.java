package com.dj.ch10;


public class ExceptionTest5 {
	
	public static void main(String[] args) {
		
		System.out.println("hello1");
		System.out.println("hello2");
		System.out.println("hello3");
		
		ExceptionTest5 t = new ExceptionTest5();
		System.out.println(t.test3());
		
		System.out.println("hello4");
		System.out.println("hello5");
		System.out.println("hello6");
	}
	
	public int test(){
		int b = 0;
		try{
			int a = 10;
			b = a/10;
			return 10;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("test");
		}
		return 20;
	}
	
	public int test1(){
		int b = 0;
		try{
			int a = 10;
			b = a/10;
			return 10;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("test");
			return 30;
		}
	}
	
	public int test2(){
		int b = 0;
		try{
			int a = 10;
			b = a/0;
			return 10;
		}catch(ClassCastException e){
			e.printStackTrace();
		}finally{
			System.out.println("test");
			
		}
		return 20;
	}
	
	public int test3(){
		int b = 0;
		try{
			int a = 10;
			if(a == 10){
				System.exit(0);
			}
			b = a/0;
			return 10;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("test");
		}
		return 20;
	}
}

