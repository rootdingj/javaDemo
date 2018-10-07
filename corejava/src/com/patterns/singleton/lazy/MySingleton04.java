package com.patterns.singleton.lazy;

/** 
 * 懒汉式 
 * Double Check Locking 双检查锁机制
 * */
public class MySingleton04 {
	// 使用volatile关键字保其可见性(轻量级)
	private volatile static MySingleton04 instance = null;
	
	private MySingleton04() {}
	
	public static MySingleton04 getInstance() {
		if(instance != null) {
			// 不创建
		}else {
			//创建实例之前可能会有一些准备性的耗时工作 
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (MySingleton02.class) {
				// 二次检查
				if(instance == null) {
					instance = new MySingleton04();
				}
			}
		}
		// 但从结果上来看，并没有解决线程安全的问题
		/*
		 * 这里在声明变量时使用了volatile关键字来保证其线程间的可见性；
		 * 在同步代码块中使用二次检查，以保证其不被重复实例化.
		 * 集合其二者，这种实现方式既保证了其高效性，也保证了其线程安全性。
		 * */ 
		return instance;
	}

}
