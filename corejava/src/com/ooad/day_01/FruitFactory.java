package com.ooad.day_01;

public class FruitFactory extends GreenFoodFactory{

	public Food productFood(){
		
		return new Fruit();
	}
}
