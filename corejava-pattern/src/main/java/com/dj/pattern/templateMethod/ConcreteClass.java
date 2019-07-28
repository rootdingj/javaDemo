package com.dj.pattern.templateMethod;

// 具体类
public class ConcreteClass extends AbstractClass {

	@Override
	public void primitiveoperationA() {
		System.out.println("primitiveoperationA() 被调用。。。");
	}

	@Override
	public void primitiveoperationB() {
		System.out.println("primitiveoperationA() 被调用。。。");
	}

}
