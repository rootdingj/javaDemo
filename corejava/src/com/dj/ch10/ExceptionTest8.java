package com.dj.ch10;

import java.lang.reflect.Field;

import com.dj.ch09.Gender;


public class ExceptionTest8 {
	
	public static void main(String[] args) {
		
		
		/*try {
			Class<Gender> c = (Class<Gender>) Class.forName("com.briup.ch07.Gender");
			
			Field[] fields = c.getDeclaredFields();
			for(Field f:fields){
				f.setAccessible(true);
				System.out.println(f.getName());
				System.out.println(f.getModifiers());
				System.out.println(f.getType());
				System.out.println(f.get(Gender.B));
			}
		} catch (ClassNotFoundException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}*/
		
		/*try {
			Class<Gender> c = (Class<Gender>) Class.forName("com.briup.ch07.Gender");
			
			Field[] fields = c.getDeclaredFields();
			for(Field f:fields){
				f.setAccessible(true);
				System.out.println(f.getName());
				System.out.println(f.getModifiers());
				System.out.println(f.getType());
				System.out.println(f.get(Gender.F));
			}
			//这个是错误的
		}catch (Exception e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}*/
		
		
		
		
		/*try {
			Class<Gender> c = (Class<Gender>) Class.forName("com.briup.ch07.Gender");
			
			Field[] fields = c.getDeclaredFields();
			for(Field f:fields){
				f.setAccessible(true);
				System.out.println(f.getName());
				System.out.println(f.getModifiers());
				System.out.println(f.getType());
				System.out.println(f.get(Gender.F));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}*/
		
		
		/*try {
			Class<Gender> c = (Class<Gender>) Class.forName("com.briup.ch07.Gender");
			
			Field[] fields = c.getDeclaredFields();
			for(Field f:fields){
				f.setAccessible(true);
				System.out.println(f.getName());
				System.out.println(f.getModifiers());
				System.out.println(f.getType());
				System.out.println(f.get(Gender.F));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}*/
			
			
		
	}
	
	public void test()throws Exception{
		
		int a = 10;
		int b = 20;
		
		if(a+b>25){
			throw new Exception("a加b不能大于25");
		}
		
		System.out.println(a+b);
		
	}
	
	
	
}

