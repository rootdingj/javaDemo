package com.dj.pattern.simpleFactory;

import com.dj.pattern.factoryMethod.ConcreteProduct1;
import com.dj.pattern.factoryMethod.ConcreteProduct2;
import com.dj.pattern.factoryMethod.Product;

public class TestClient {

	public static void main(String[] args) {
		
		/*int type = 1;
        Product product;
        if (type == 1) {
            product = new ConcreteProduct1();
        } else if (type == 2) {
            product = new ConcreteProduct2();
        } else {
            product = new ConcreteProduct();
        }*/
		// 简单工厂剥离会
		SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(1);

	}

}
