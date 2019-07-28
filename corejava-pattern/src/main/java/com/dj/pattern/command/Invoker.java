package com.dj.pattern.command;

// 请求者类
public class Invoker {

	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void call() {
		System.out.println("请求者类执行命令command。。。");
		command.execute();
	}
}
