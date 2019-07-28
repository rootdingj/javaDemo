package com.dj.pattern.flyweight;

// 具体享元类
public class ConcreteFlyweight implements Flyweight {
	
	// 内部状态，同一个享元对象的内部状态相同
	private String intrinsicState;

	public ConcreteFlyweight(String intrinsicState) {
		this.intrinsicState = intrinsicState;
		System.out.println("创建具体享元对象，内部状态为" + intrinsicState);
	}

	//根据外部状态进行逻辑处理
	@Override
	public void operation(String extrinsicState) {
		System.out.println("Object address: " + System.identityHashCode(this));
        System.out.println("intrinsicState: " + intrinsicState);
        System.out.println("extrinsicState: " + extrinsicState);
	}
}
