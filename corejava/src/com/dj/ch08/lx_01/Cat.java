package com.dj.ch08.lx_01;

public class Cat extends Animal implements Pet{
	
	private String name;
	public Cat() {
		this("tom");
		System.out.println(name+"猫再次...");
	}
	public Cat(String name){
		super(4);
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void play(){
		System.out.println(name+"猫，在哈啤...");
	}
	public void eat(){
		System.out.println(name+"猫，在吃饭");
	}

}
