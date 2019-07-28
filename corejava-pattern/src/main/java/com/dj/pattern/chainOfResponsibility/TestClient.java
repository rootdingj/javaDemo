package com.dj.pattern.chainOfResponsibility;

// 测试客户端
public class TestClient {

	public static void main(String[] args) {
		 //组装责任链 
        Handler handlerA=new ConcreteHandlerA(); 
        Handler handlerB=new ConcreteHandlerB(); 
        Handler handlerC=new ConcreteHandlerC(); 
        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);
        //提交请求 
        handlerA.requestHandle("B");
        handlerB.requestHandle("C");
        
	}

}
