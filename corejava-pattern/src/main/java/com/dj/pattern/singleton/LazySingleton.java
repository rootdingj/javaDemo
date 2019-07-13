package com.dj.pattern.singleton;

/**
 * 
 * @ClassName: LazySingleton
 * @Description: 单例-懒汉式（非线程安全）
 * @author Steven
 * @date 2018年7月13日
 *
 */
public class LazySingleton {
	//私有静态变量 uniqueInstance 被延迟实例化。好处是，如果没有用到该类，那么就不会实例化 uniqueInstance，从而节约资源。
	private static LazySingleton uniqueInstance = null;

	private LazySingleton() {

	}

	public static LazySingleton getUniqueInstance() {
		// 如果多个线程能够同时进入，将导致实例化多次 uniqueInstance
		if (uniqueInstance == null) {
			uniqueInstance = new LazySingleton();
		}
		return uniqueInstance;
	}

}
