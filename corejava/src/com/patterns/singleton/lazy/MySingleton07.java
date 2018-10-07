package com.patterns.singleton.lazy;

/** 
 * 懒汉式
 * 使用static代码块实现单例
 *  */
public class MySingleton07 {

	private static MySingleton07 instance = null;

	private MySingleton07() {}
	
	static{
		instance = new MySingleton07();
	}

	public static MySingleton07 getInstance() {
		return instance;
	}

}
