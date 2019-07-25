package com.dj.pattern.adapter;

public class TestClassAdapter {

	public static void main(String[] args) {

		System.out.println("类适配器测试。。。");
        Target target = new ClassAdapter();
        target.request();
	}

}
