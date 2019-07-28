package com.dj.pattern.strategy;

// 测试客户端
public class TestClient {

	public static void main(String[] args) {
		Context context = new Context();
		Strategy concreteA = new ConcreteStrategyA();
		Strategy concreteB = new ConcreteStrategyB();
		context.setStrategy(concreteA);
		context.operation();
		context.setStrategy(concreteB);
		context.operation();
	}

}
