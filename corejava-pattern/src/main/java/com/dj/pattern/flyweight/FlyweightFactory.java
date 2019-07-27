package com.dj.pattern.flyweight;

import java.util.HashMap;

// 享元工厂类
public class FlyweightFactory {

	private HashMap<String, Flyweight> map = new HashMap<String, Flyweight>(16);

	public Flyweight getFlyweight(String key) {
		Flyweight flyweight = null;
		if (map.containsKey(key)) {
			flyweight = map.get(key);
			System.out.println("已存在享元对象，直接返回，key=" + key);
		} else {
			flyweight = new ConcreteFlyweight(key);
			map.put(key, flyweight);
		}
		return flyweight;
	}

}
