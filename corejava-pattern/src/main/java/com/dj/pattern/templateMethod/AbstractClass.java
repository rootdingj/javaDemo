package com.dj.pattern.templateMethod;

// 抽象类
public abstract class AbstractClass {
	// 模板方法，定义了一系列的逻辑步骤，每个步骤由一个方法表示
	public void templateMethod() {
		hookMethod();
		primitiveoperationA();
		primitiveoperationB();

	}

	// 钩子方法，钩子可以让子类实现算法中可选部分
	public void hookMethod() {
		System.out.println("钩子方法，空（或默认）实现，子类重写实现相应的逻辑。");
	}

	// 抽象方法，由子类实现
	public abstract void primitiveoperationA();

	public abstract void primitiveoperationB();

}
