package com.dj.pattern.decorator;

//具体组件
public class ConcreteComponent implements Component {

	public ConcreteComponent() {
		System.out.println("创建具体组件。。。");
	}

	@Override
	public void operation() {
		System.out.println("执行具体组件的 operation()");
	}

}
