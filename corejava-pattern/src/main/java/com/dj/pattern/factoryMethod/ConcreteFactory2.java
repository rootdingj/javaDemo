package com.dj.pattern.factoryMethod;

public class ConcreteFactory2 implements AbstractFactory {

	@Override
	public Product createProduct() {
		System.out.println("具体工厂2，new了一个具体产品2");
		return new ConcreteProduct2();
	}
  
}
