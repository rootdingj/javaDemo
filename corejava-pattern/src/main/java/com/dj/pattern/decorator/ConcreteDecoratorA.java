package com.dj.pattern.decorator;

// 具体装饰类A，具体装饰类应当是装饰层次的最低层
public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	public void operation() {
		// 调用被装饰者方法，保留了被装饰者的功能
		super.operation();
		// 在被装饰者的基础上扩展 addBehaviorA() 功能
		addBehaviorA();
	}

	public void addBehaviorA() {
		System.out.println("在被装饰者的基础上扩展 addBehaviorA() 功能");
	}

}
