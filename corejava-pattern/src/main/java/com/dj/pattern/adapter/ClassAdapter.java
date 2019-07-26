package com.dj.pattern.adapter;

// 类适配器，通过继承方式，把适配者接口转换成目标接口
public class ClassAdapter extends Adaptee implements Target{

	@Override
	public void request() {
		concreteRequest();
	}

}
