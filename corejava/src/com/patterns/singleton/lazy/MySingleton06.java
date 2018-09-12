package com.patterns.singleton.lazy;

import java.io.ObjectStreamException;
import java.io.Serializable;

/** 
 * 懒汉式
 * 序列化与反序列化的单例模式实现
 *  */
public class MySingleton06 implements Serializable {

	/**
	 * @Fields serialVersionUID : serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private static class MySingletonFactory {
		private static MySingleton06 instance = new MySingleton06();
	}

	private MySingleton06() {}
	
	public static MySingleton06 getInstance() {
		return MySingletonFactory.instance;
	}
	
	//该方法在反序列化时会被调用，该方法不是接口定义的方法，有点儿约定俗成的感觉
	protected Object readResolve() throws ObjectStreamException {
		System.out.println("调用了readResolve方法！");
		return MySingletonFactory.instance; 
	}
	
}
