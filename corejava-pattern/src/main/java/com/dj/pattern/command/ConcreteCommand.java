package com.dj.pattern.command;

// 具体命令类
public class ConcreteCommand implements Command {

	private Receiver receiver;

	public ConcreteCommand() {
		receiver = new Receiver();
	}

	@Override
	public void execute() {
		receiver.action();
	}

}
