package com.dj.pattern.flyweight;

// 非享元具体类
public class UnConcreteFlyweight {

	private String msg;

	public UnConcreteFlyweight(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
