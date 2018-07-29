package com.dj.ch09;

public class GenericTest2 {
	public static void main(String[] args) {
		
		Person<String> p = new Person<String>() {

			@Override
			public void test(String t) {
				// TODO Auto-generated method stub
			}
		};
	}
}

abstract class Person<T>{
	
	private T str;
	private long id;
	public T getStr() {
		return str;
	}
	public void setStr(T str) {
		this.str = str;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public abstract void test(T t);
}
