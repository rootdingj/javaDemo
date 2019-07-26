package com.dj.pattern.adapter;

public class TestClassAdapter {

	public static void main(String[] args) {

		System.out.println("类适配器测试。。。");
        Target target = new ClassAdapter();
        // 客户端绑定的是接口而不是实现，可以根据需要新增不同的实现（适配器）
        target.request();
	}

}
