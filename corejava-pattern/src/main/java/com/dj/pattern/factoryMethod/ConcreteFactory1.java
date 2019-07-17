package com.dj.pattern.factoryMethod;

public class ConcreteFactory1 implements AbstractFactory {

	@Override
	public Product createProduct() {
		System.out.println("具体工厂1，new了一个具体产品1");
		return new ConcreteProduct1();
	}

}
