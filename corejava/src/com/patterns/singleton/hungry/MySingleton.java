package com.patterns.singleton.hungry;

/** 饿汉式单例 */
public class MySingleton {
	
	private static MySingleton instance = new MySingleton();
	
	private MySingleton() {}

	public static MySingleton getInstance() {
		return instance;
	}

}
