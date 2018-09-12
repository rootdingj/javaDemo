package com.exam.ali;

public class MySingleton10 {
	/** 饿汉式单例 */
	private static MySingleton10 singleton = new MySingleton10();
	
	private MySingleton10(){}
	
	public static MySingleton10 getInstance() {
		return singleton;
	}

}
