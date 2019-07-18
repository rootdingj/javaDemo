package com.dj.pattern.factoryMethod;

import com.dj.pattern.simpleFactory.ConcreteProductA;
import com.dj.pattern.simpleFactory.Product;

public class ConcreteFactoryA implements FactoryMethod {

	@Override
	public Product createProduct() {
		System.out.println("具体工厂A，new了一个具体产品A");
		return new ConcreteProductA();
	}

}
