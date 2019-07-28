package com.dj.pattern.state;

// 测试客户端
public class TestClient {

	public static void main(String[] args) {
		Context context = new Context();
		Status concreteA = new ConcreteStratusA();
		Status concreteB = new ConcreteStratusB();
		context.setStatus(concreteA);
		context.operation();
		context.setStatus(concreteB);
		context.operation();
	}
}
