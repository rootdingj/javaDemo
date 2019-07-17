package com.dj.pattern.simpleFactory;

import com.dj.pattern.factoryMethod.Product;

public class ConcreteProduct implements Product {

	@Override
	public void show() {
		System.out.println("具体产品。。。");
	}

}
