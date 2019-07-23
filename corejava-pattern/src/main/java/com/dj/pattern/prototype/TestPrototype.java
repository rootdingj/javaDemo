package com.dj.pattern.prototype;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		ConcretePrototype prototype = new ConcretePrototype();
		ConcretePrototype clone = (ConcretePrototype) prototype.clone();
		System.out.println("原型和拷贝对象引用是否相同：" + (prototype == clone));
	}

}
