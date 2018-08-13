package com.ooad.day_01;

public class VegetableFactory extends GreenFoodFactory{
	
	public Food VegetableFood(){
		
		return new Vegetable();
	}

}
