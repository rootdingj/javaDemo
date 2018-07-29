package com.dj.ch08.lx_01;

public class Fish extends Animal implements Pet{

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Fish() {
		super(0);
		System.out.println("鱼儿没有脚..");
	}
	@Override
	public void play() {
		System.out.println(name+"在玩耍...");
	}
	@Override
	public void eat() {
		System.out.println(name+"在吃东西");
	}
	
	
}
