package com.dj.pattern.chainOfResponsibility;

// 抽象处理类
public abstract class Handler {

	protected Handler successor;

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

	public Handler getSuccessor() {
		return successor;
	}

	protected abstract void requestHandle(String request);

}
