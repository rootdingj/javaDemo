package com.dj.pattern.singleton;

/**
 * 
 * @ClassName: LazySingleton
 * @Description: 静态内部类单例模式（线程安全）
 * @author Steven
 * @date 2018年7月13日
 *
 */
public class StaticInnerSingleton {

	// 静态内部类保证了单例在多线程并发下的线程安全性
	private static class MySingletonFactory {
		 // 使用final修饰，可以避免变量被重新赋值，JVM也不用去跟踪该引用是否被更改
		 private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
	}

	private StaticInnerSingleton() {
	}

	public static StaticInnerSingleton getInstance() {
		return MySingletonFactory.INSTANCE;
	}

}
