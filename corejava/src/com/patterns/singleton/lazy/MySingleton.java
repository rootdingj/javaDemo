package com.patterns.singleton.lazy;

/** 懒汉式 */
public class MySingleton {
	
	private static MySingleton instance = null;
	
	private MySingleton() {}
	
	public static MySingleton getInstance() {
		// 1.简单的懒汉式单例，在多线程并发下这样的实现是无法保证实例实例唯一的
		/*if(instance == null){
			instance = new MySingleton();
		}*/
		
		// 2.多线程并发下的单例
		if(instance != null) {
			// 不创建
		}else {
			//创建实例之前可能会有一些准备性的耗时工作 
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			instance = new MySingleton();
		}
		// 从执行结果可以看出，单例的线程安全性并没有得到保证
		// 如何解决：要保证线程安全，我们可以使用同步锁机制
		return instance;
	}

}
