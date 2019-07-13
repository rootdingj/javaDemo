package com.dj.pattern.singleton;

/**
 * 
 * @ClassName: HungrySingleton
 * @Description: 单例-恶汉式
 * @author Steven
 * @date 2018年7月13日
 *
 */
public class HungrySingleton {

	private static HungrySingleton uniqueInstance = new HungrySingleton();

	private HungrySingleton() {
	}

	public static HungrySingleton getInstance() {
		return uniqueInstance;
	}

/*
 * 1.线程不安全问题主要是由于 uniqueInstance 被实例化多次，采取直接实例化 uniqueInstance 的方式就不会产生线程不安全问题。
 * 2.直接实例化的方式也丢失了延迟实例化带来的节约资源的好处。
 */
}
