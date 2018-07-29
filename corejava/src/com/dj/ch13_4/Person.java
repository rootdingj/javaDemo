package com.dj.ch13_4;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = -9102017020286042305L;
	private String name;  //ĞÕÃû
	private int age; 	  //ÄêÁä
	private Car car; 	  //×ù¼İ

	public Person(String name, int age, Car car) {
		this.name = name;
		this.age = age;
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car=" + car + "]";
	}

}
