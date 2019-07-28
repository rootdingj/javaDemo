package com.dj.pattern.templateMethod;

// 测试客户端
public class TestClient {

	public static void main(String[] args) {
		
		AbstractClass concrete = new ConcreteClass();
		concrete.templateMethod();
	}

}
