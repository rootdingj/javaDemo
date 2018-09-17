package com.source.pfinal;

public class Custom extends Person{

	public Custom(String name) {
		super(name);
	}
	
//	public void test() {} // 不能覆盖父类 final修饰的方法
	
	public static void main(String[] args) {
		new Custom("Custom").test();
	}

}
