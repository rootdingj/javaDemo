package com.dj.pattern.state;

// 环境类
public class Context {

	private Status status;

	public void setStatus(Status status) {
		this.status = status;
	}

	// 通过 set 不同的 status 对象，而动态地改变他的行为
	public void operation() {
		status.handle();
	}

}
