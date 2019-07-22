package com.dj.pattern.prototype;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {

		ConcretePrototype prototype = new ConcretePrototype("具体原型");
		ConcretePrototype clone = (ConcretePrototype) prototype.clone();
		System.out.println("具体原型和具体原型克隆引用是否相同：" + (prototype == clone));
		System.out.println(prototype.getName());
		System.out.println(clone.getName());
		clone.setName("具体原型克隆");
		System.out.println(prototype.getName());
		System.out.println(clone.getName());

	}

}
