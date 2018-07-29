package com.dj.ch08.lx_01;

public class TestAnimals {

	public static void main(String[] args) {
		Fish f = new Fish();
		Cat c = new Cat("Fluffy");
		Animal a = new Fish();
		Animal e = new Spider(0);
		Pet p = new Cat();

		f.play();
		c.play();

		e.eat();
		e.walk();

  		a.walk();
	}
	
}
