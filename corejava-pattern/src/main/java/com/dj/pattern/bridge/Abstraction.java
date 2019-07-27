package com.dj.pattern.bridge;

// 抽象类
public abstract class Abstraction {

	protected Implementor imple;

	protected Abstraction(Implementor imple) {
		this.imple = imple;
	}

	public abstract void opration();

}
