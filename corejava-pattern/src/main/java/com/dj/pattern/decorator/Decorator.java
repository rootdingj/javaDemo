package com.dj.pattern.decorator;

// 抽象装饰类(被装饰者)
public class Decorator implements Component {

	private Component component;

	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void operation() {
		component.operation();
	}

}
