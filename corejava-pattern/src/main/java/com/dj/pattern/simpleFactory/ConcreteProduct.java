package com.dj.pattern.simpleFactory;

public class ConcreteProduct implements Product {

	@Override
	public void show() {
		System.out.println("具体产品。。。");
	}

}
