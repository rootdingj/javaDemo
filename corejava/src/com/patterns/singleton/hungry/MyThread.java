package com.patterns.singleton.hungry;

/**
 * 饿汉式在多线程下的执行情况
 * */
public class MyThread extends Thread {

	@Override
	public void run() {
		// 从运行结果可以看出实例变量额hashCode值一致，这说明对象是同一个，饿汉式单例实现了。
		System.out.println(MySingleton.getInstance().hashCode());
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
