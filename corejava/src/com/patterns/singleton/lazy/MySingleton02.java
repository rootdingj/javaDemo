package com.patterns.singleton.lazy;

/** 
 * 懒汉式 
 * 同步代码块实现
 * */
public class MySingleton02 {
	
	private static MySingleton02 instance = null;
	
	private MySingleton02() {}
	
	public static MySingleton02 getInstance() {
		try {
			synchronized (MySingleton02.class) {
				if (instance != null) {
					// 不创建
				} else {
					// 创建实例之前可能会有一些准备性的耗时工作
					Thread.sleep(300);
					instance = new MySingleton02();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 从结果上来看，也可以保证安全性，但是全部的代码都被锁上了，同样的效率很低下
		return instance;
	}

}
