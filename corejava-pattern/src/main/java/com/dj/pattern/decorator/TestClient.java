package com.dj.pattern.decorator;

//测试客户端
public class TestClient {

	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		
		Component decoratorA = new ConcreteDecoratorA(component);
		decoratorA.operation();
		
		Component decoratorB = new ConcreteDecoratorB(component);
		decoratorB.operation();
		
	}

}
