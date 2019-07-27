package com.dj.pattern.decorator;

// 具体装饰类B
public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	public void operation() {
		super.operation();
		addBehaviorB();
	}

	public void addBehaviorB() {
		System.out.println("在被装饰者的基础上扩展 addBehaviorB() 功能");
	}

}
