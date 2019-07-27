package com.dj.pattern.flyweight;

// 具体享元类
public class ConcreteFlyweight implements Flyweight {

	private String key;

	public ConcreteFlyweight(String key) {
		this.key = key;
		System.out.println("创建具体享元对象，key=" + key);
	}

	@Override
	public void operation(UnConcreteFlyweight state) {
		// 执行享元代码逻辑（通用代码逻辑）
		System.out.println("执行享元代码逻辑，key=" + key);
		// 执行非享元代码逻辑
		System.out.println("非享元信息是：" + state.getMsg());

	}

}
