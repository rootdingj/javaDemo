package com.dj.pattern.abstractFactory;

// 由子类决定创建具体的产品
public class ConcreteFactory1 implements AbstractFactory {

	@Override
	public ProductA createProductA() {
		
		return new ConcreteProductA1();
	}

	@Override
	public ProductB createProductB() {
		
		return new ConcreteProductB1();
	}

}
