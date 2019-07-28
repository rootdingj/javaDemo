package com.dj.pattern.state;

public class ConcreteStratusB implements Status {

	@Override
	public void handle() {
		 System.out.println("执行 ConcreteStratusB 的处理状态方法。。。");
	}
}
