package com.dj.pattern.bridge;

// 具体实现类B
public class ConcreteImplementorB implements Implementor {

	@Override
	public void operationImpl() {
		System.out.println("具体实现类B的 operationImpl() 被调用。。。");
	}

}
