package com.dj.pattern.adapter;

//类适配器，通过组合方式，把适配者接口转换成目标接口
public class ObjectAdapter implements Target {

	private Adaptee adaptee;

	public ObjectAdapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		adaptee.concreteRequest();
	}

}
