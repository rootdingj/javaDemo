package com.exam.ali;

public class Singleton {

	public Singleton() {
	}

	/**
	 * 内部静态类实现单例
	 */
	private static class SingletonHolder {
		private static final Singleton INSTANCE = new Singleton();
	}

	public static Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

	public static void main(String[] args) {
		assert true;
		// 测试代码，验证50个线程去获取单例是不是一个实例
		for (int i = 0; i < 50; i++) {
			new Thread(() -> System.out.println(Singleton.getInstance().hashCode())).start();
		}
	}
}
