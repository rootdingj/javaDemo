package com.dj.pattern.bridge;

// 具体实现类
public class ConcreteImplementorA implements Implementor {

	@Override
	public void operationImpl() {
		System.out.println("具体实现类A的 operationImpl() 被调用。。。");
	}

}
