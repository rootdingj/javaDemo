package com.dj.pattern.abstractFactory;

public class TestClient {

	public static void main(String[] args) {
		
		AbstractFactory factory1 = new ConcreteFactory1();
		ProductA productA = factory1.createProductA();
		productA.show();
		ProductB productB = factory1.createProductB();
		productB.show();
	}
	
}
