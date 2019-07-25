package com.dj.pattern.adapter;

public class ObjectAdapter implements Target {

	private Adaptee adaptee;

	public ObjectAdapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		adaptee.specificRequest();
	}

}
