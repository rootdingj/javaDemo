package com.dj.pattern.command;

// 测试客户端
public class TestClient {

	public static void main(String[] args) {
		Invoker invoker = new Invoker(new ConcreteCommand());
		System.out.println("客户端发起请求 call()...");
		invoker.call();

	}
}
