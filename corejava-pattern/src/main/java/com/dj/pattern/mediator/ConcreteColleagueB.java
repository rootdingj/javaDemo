package com.dj.pattern.mediator;

// 具体同事类B
public class ConcreteColleagueB extends Colleague {

	@Override
	public void receive() {
		System.out.println("具体同事类B 接收到了请求。。。");
	}

	@Override
	public void send() {
		System.out.println("具体同事类B 发出了请求。。。");
		// 请中介者转发
		mediator.relay(this);
	}

}
