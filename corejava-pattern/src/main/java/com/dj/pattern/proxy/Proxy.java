package com.dj.pattern.proxy;

public class Proxy implements Subject {

	private Subject realSubject;

	@Override
	public void request() {
		if(realSubject==null) {
			realSubject = new RealSubject();
		}
		preRequest();
		realSubject.request();
		postRequest();
	}

	public void preRequest() {
		System.out.println("访问真实主题之前处理。");
	}

	public void postRequest() {
		System.out.println("访问真实主题之后处理。");
	}

}
