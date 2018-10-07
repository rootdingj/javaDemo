package com.patterns.singleton.lazy;

/** 
 * 懒汉式 
 * 同步代码块实现： 针对某些重要的代码来进行单独的同步（可能非线程安全）
 * */
public class MySingleton03 {
	
	private static MySingleton03 instance = null;
	
	private MySingleton03() {}
	
	public static MySingleton03 getInstance() {
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
				instance = new MySingleton03();
			}
		}
		// 针对某些重要的代码进行单独的同步，而不是全部进行同步，可以极大的提高执行效率
		// 但从结果上来看，并没有解决线程安全的问题
		return instance;
	}

}
