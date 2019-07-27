package com.dj.pattern.bridge;

//测试客户端
public class TestClient {

	public static void main(String[] args) {

		Implementor imple = new ConcreteImplementorA();
		Abstraction abstraction = new RefinedAbstraction(imple);
		abstraction.opration();
	}

}
