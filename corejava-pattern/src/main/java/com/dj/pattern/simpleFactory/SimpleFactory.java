package com.dj.pattern.simpleFactory;

import com.dj.pattern.factoryMethod.ConcreteProduct1;
import com.dj.pattern.factoryMethod.ConcreteProduct2;
import com.dj.pattern.factoryMethod.Product;

public class SimpleFactory {

	public Product createProduct(int type) {
		if (type == 1) {
			return new ConcreteProduct1();
		} else if (type == 2) {
			return new ConcreteProduct2();
		}
		return new ConcreteProduct();
	}
	
	// 用静态方法定义工厂，静态工厂
	/*public static Product createProduct(int type) {
		if (type == 1) {
			return new ConcreteProduct1();
		} else if (type == 2) {
			return new ConcreteProduct2();
		}
		return new ConcreteProduct();
	}*/

}
