package com.dj.pattern.composite.safety;

//测试客户端，安全方式的组合模式
public class TestClient {

	public static void main(String[] args) {

		Composite c0 = new Composite();
		Composite c1 = new Composite();
		Component leaf1 = new Leaf("leaf1");
		Component leaf2 = new Leaf("leaf2");
		Component leaf3 = new Leaf("leaf3");
		c0.add(leaf1);
		c0.add(c1);
		c1.add(leaf2);
		c1.add(leaf3);
		c0.operation();
	}

}
