package com.dj.pattern.flyweight;

// 测试客户端
public class TestClient {

	public static void main(String[] args) {
		
		FlyweightFactory factory=new FlyweightFactory();
		// 只创建一次享元对象
		Flyweight a0 = factory.getFlyweight("A");
		Flyweight a1 = factory.getFlyweight("A");
		
		a0.operation("a0");       
		a1.operation("a1"); 
		
	}

}
