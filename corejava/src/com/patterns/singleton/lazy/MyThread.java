package com.patterns.singleton.lazy;

/**
 * 饿汉式在多线程下的执行情况
 * */
public class MyThread extends Thread {

	@Override
	public void run() {
		// 从运行结果可以看出实例变量额hashCode值一致，这说明对象是同一个，饿汉式单例实现了。
//		System.out.println(MySingleton.getInstance().hashCode());
//		System.out.println(MySingleton01.getInstance().hashCode());
//		System.out.println(MySingleton02.getInstance().hashCode());
//		System.out.println(MySingleton03.getInstance().hashCode());
//		System.out.println(MySingleton04.getInstance().hashCode());
//		System.out.println(MySingleton05.getInstance().hashCode());
//		System.out.println(MySingleton07.getInstance().hashCode());
//		System.out.println(EnumFactory.singletonFactory.getInstance().hashCode());
		System.out.println(EnumSingletonFactory.getInstance().hashCode());
	}

	public static void main(String[] args) {
		MyThread[] mts = new MyThread[10];
		for (int i = 0; i < mts.length; i++) {
			mts[i] = new MyThread();
		}
		for (int j = 0; j < mts.length; j++) {
			mts[j].start();
		}
	}

}
