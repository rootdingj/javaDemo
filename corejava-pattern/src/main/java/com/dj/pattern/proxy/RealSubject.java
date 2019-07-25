package com.dj.pattern.proxy;

public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("我是真正干活的...");
	}

}
