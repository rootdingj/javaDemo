package com.dj.base.ch06;

import java.util.Random;

public class FruitGenerator implements Generator<String> {

	private String[] fruits = new String[] { "Apple", "Banana", "Pear" };

	@Override
	public String method() {
		Random rand = new Random();
		return fruits[rand.nextInt(3)];
	}

}
