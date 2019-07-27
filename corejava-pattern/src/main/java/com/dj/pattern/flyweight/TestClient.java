package com.dj.pattern.flyweight;

public class TestClient {

	public static void main(String[] args) {
		
		FlyweightFactory factory=new FlyweightFactory();
		Flyweight a0 = factory.getFlyweight("A");
		Flyweight a1 = factory.getFlyweight("A");
		
		a0.operation(new UnConcreteFlyweight("a0"));       
		a1.operation(new UnConcreteFlyweight("a1")); 
		
	}

}
