package com.dj.pattern.factoryMethod;

import com.dj.pattern.simpleFactory.Product;

public class TestClient {

	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("com.dj.pattern.factoryMethod.ConcreteFactoryA");
			FactoryMethod  factory = (FactoryMethod)c.newInstance();
			Product product = factory.createProduct();
			product.show();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}
}
