package com.patterns.singleton.lazy;

/** 
 * 懒汉式
 * 使用静态内置类实现单例模式
 *  */
public class MySingleton05 {
	
	private static class MySingletonFactory {
		private static MySingleton05 instance = new MySingleton05();
	}

	private MySingleton05() {}
	
	public static MySingleton05 getInstance() {
		return MySingletonFactory.instance;
	}
	// 静态内部类虽然保证了单例在多线程并发下的线程安全性，但是在遇到序列化对象时，默认的方式运行得到的结果就是多例的。
	
}
