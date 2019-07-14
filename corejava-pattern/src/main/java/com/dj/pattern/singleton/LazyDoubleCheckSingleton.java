package com.dj.pattern.singleton;

/**
 * 
 * @ClassName: LazySingleton
 * @Description: 单例-懒汉式（线程安全）</br>
 *               Double Check Locking 双重校验锁机制
 * @author Steven
 * @date 2018年7月13日
 *
 */
public class LazyDoubleCheckSingleton {

	// volatile：保证了不同线程对变量进行操作时的可见性，可以禁止 JVM 的指令重排序
	private static volatile LazyDoubleCheckSingleton uniqueInstance = null;

	private LazyDoubleCheckSingleton() {

	}

	public static LazyDoubleCheckSingleton getUniqueInstance() {
		// 第一次检查，用来避免 uniqueInstance 已经被实例化之后的加锁操作
		if (uniqueInstance != null) {
			// 不创建
		} else {
			// 创建实例之前（等待100毫秒）可能会有一些准备性的耗时工作
			try {
				Thread.sleep(100L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (LazyDoubleCheckSingleton.class) {
				// 第二次检查，加了锁，确保只有一个线程进行实例化操作
				if (uniqueInstance == null) {
					uniqueInstance = new LazyDoubleCheckSingleton();
				}
			}
		}
		/*
		 * 这里在声明变量时使用了volatile关键字来保证其线程间的可见性； 在同步代码块中使用二次检查，以保证其不被重复实例化.
		 * 集合其二者，这种实现方式既保证了其高效性，也保证了其线程安全性。
		 */
		return uniqueInstance;
	}

}
