package com.dj.pattern.builder;

public class TestClient {

	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		Product product = director.buildProduct();
		product.show();
	}
}
