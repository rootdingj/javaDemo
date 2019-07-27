package com.dj.pattern.bridge;

// 扩展抽象类
public class RefinedAbstraction extends Abstraction {

	protected RefinedAbstraction(Implementor imple) {
		super(imple);
	}

	@Override
	public void opration() {
		System.out.println("扩展抽象类的 opration() 被调用。。。 ");
		imple.operationImpl();
	}

}
