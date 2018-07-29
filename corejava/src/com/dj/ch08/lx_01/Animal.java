package com.dj.ch08.lx_01;

public abstract class Animal {

	protected int legs;
	protected Animal(int legs) {
		this.legs = legs;
		System.out.println("你有几只脚");
	}
	public void walk(){
		System.out.println("哪个动物在走路");
	}
	public abstract void eat();
	
}
