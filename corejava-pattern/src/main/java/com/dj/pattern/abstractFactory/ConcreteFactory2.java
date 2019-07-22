package com.dj.pattern.abstractFactory;

public class ConcreteFactory2 implements AbstractFactory {

	@Override
	public ProductA createProductA() {
		
		return new ConcreteProductA2();
	}

	@Override
	public ProductB createProductB() {
		
		return new ConcreteProductB2();
	}

}
