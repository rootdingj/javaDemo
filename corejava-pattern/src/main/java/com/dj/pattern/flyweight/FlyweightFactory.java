package com.dj.pattern.flyweight;

import java.util.HashMap;

// 享元工厂类
public class FlyweightFactory {

	private HashMap<String, Flyweight> cachePool = new HashMap<String, Flyweight>(16);

	public Flyweight getFlyweight(String intrinsicState) {
		Flyweight flyweight = null;
		if (cachePool.containsKey(intrinsicState)) {
			flyweight = cachePool.get(intrinsicState);
			System.out.println("已存在享元对象直接获取，内部状态为" + intrinsicState);
		} else {
			flyweight = new ConcreteFlyweight(intrinsicState);
			cachePool.put(intrinsicState, flyweight);
		}
		return flyweight;
	}

}
