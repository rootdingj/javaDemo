package com.dj.pattern.adapter;

public class TestObjectAdapter {

	public static void main(String[] args) {

		System.out.println("对象适配器测试。。。");
		Target target = new ObjectAdapter(new Adaptee());
		target.request();
	}

}
