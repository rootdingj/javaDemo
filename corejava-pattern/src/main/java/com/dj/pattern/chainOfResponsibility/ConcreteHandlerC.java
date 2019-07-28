package com.dj.pattern.chainOfResponsibility;

//具体处理类B
public class ConcreteHandlerC extends Handler {

	@Override
	protected void requestHandle(String request) {
		if ("C".equals(request)) {
			System.out.println("具体处理类C 处理请求。。。");
		} else {
			Handler handler = super.getSuccessor();
			if (handler != null) {
				handler.requestHandle(request);
			} else {
				System.out.println("没有后继者处理该请求。。。");
			}
		}
	}

}
