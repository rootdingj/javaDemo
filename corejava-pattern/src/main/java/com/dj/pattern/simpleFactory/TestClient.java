package com.dj.pattern.simpleFactory;

public class TestClient {

	public static void main(String[] args) {
		Product product = null;
		/*int type = 1;
		if (type == 1) {
			product = new ConcreteProductA();
		} else if (type == 2) {
			product = new ConcreteProductA();
		}*/
		// 用简单工厂封装实例化具体类的代码
		SimpleFactory simpleFactory = new SimpleFactory();
		product = simpleFactory.createProduct(1);
		product.show();
	}
}
