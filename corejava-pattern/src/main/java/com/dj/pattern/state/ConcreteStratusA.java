package com.dj.pattern.state;

//具体状态类A
public class ConcreteStratusA implements Status {

	@Override
	public void handle() {
		 System.out.println("执行 ConcreteStratusA 的处理状态方法。。。");
	}
}
