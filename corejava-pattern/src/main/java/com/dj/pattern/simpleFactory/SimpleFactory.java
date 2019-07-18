package com.dj.pattern.simpleFactory;

public class SimpleFactory {

	public Product createProduct(int type) {
		if (type == 1) {
			return new ConcreteProductA();
		} else if (type == 2) {
			return new ConcreteProductB();
		}else {
			return new ConcreteProduct();
		}
	}
	
	// 用静态方法定义的简单工厂称为静态工厂
	/*public static Product createProduct(int type) {
		if (type == 1) {
			return new ConcreteProduct1();
		} else if (type == 2) {
			return new ConcreteProduct2();
		}
		return new ConcreteProduct();
	}*/

}
