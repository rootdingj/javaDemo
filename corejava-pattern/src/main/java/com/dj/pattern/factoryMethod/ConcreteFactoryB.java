package com.dj.pattern.factoryMethod;

import com.dj.pattern.simpleFactory.ConcreteProductB;
import com.dj.pattern.simpleFactory.Product;

public class ConcreteFactoryB implements FactoryMethod {

	@Override
	public Product createProduct() {
		System.out.println("具体工厂B，new了一个具体产品B");
		return new ConcreteProductB();
	}
}
