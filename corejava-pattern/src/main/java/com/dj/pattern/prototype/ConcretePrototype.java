package com.dj.pattern.prototype;

public class ConcretePrototype implements Cloneable {

	private String name;

	public ConcretePrototype() { }

	public ConcretePrototype(String name) {
		System.out.println("创建具体原型，name=" + name);
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		System.out.println("复制具体原型。。。");
		// 父类Object.clone()的浅拷贝
		return (ConcretePrototype) super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
