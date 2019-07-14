package com.dj.pattern.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 
 * @ClassName: SerializeSingleton
 * @Description: 序列化与反序列化的单例模式（线程安全）
 * @author Steven
 * @date 2018年7月13日
 *
 */
public class SerializeSingleton implements Serializable {

	/**
	 * @Fields serialVersionUID : serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	// 静态内部类虽然保证了单例在多线程并发下的线程安全性
	private static class MySingletonFactory {
		
		private static final SerializeSingleton instance = new SerializeSingleton();
	}

	private SerializeSingleton() {}

	public static SerializeSingleton getInstance() {
		return MySingletonFactory.instance;
	}

	// 不加readResolve()，默认的方式运行得到的结果就是多例的
	protected Object readResolve() throws ObjectStreamException {
		System.out.println("调用了readResolve方法！");
		return MySingletonFactory.instance;
	}

}
