package com.dj.pattern.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 
 * @ClassName: LazySingleton
 * @Description: 单例-懒汉式（静态内部类序列化与反序列化的单例模式实现线程安全）
 * @author Steven
 * @date 2018年7月13日
 *
 */
public class StaticInnerSingleton implements Serializable {

	/**
	 * @Fields serialVersionUID : serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	// 静态内部类虽然保证了单例在多线程并发下的线程安全性
	private static class MySingletonFactory {
		private static StaticInnerSingleton instance = new StaticInnerSingleton();
		// 用常量有什么好处
//		private static final StaticInnerSingleton instance = new StaticInnerSingleton();
	}

	private StaticInnerSingleton() {}
	
	public static StaticInnerSingleton getInstance() {
		return MySingletonFactory.instance;
	}
	
	//该方法在反序列化时会被调用，该方法不是接口定义的方法，有点儿约定俗成的感觉（解决了序列化对象时，默认的方式运行得到的结果是多例）
	protected Object readResolve() throws ObjectStreamException {
		System.out.println("调用了readResolve方法！");
		return MySingletonFactory.instance; 
	}
	
}
