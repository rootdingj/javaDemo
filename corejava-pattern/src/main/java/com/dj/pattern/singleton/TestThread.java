package com.dj.pattern.singleton;

public class TestThread extends Thread {

	@Override
	public void run() {
		// 从运行结果可以看出实例变量额hashCode值一致，这说明对象是同一个，饿汉式单例实现了。
//		System.out.println(HungrySingleton.getInstance().hashCode());
//		System.out.println(LazySingleton.getInstance().hashCode());
//		System.out.println(LazyDoubleCheckSingleton.getInstance().hashCode());
//		System.out.println(StaticInnerSingleton.getInstance().hashCode());
		System.out.println(EnumSingleton.getInstance().hashCode());
	}

	public static void main(String[] args) {
		TestThread[] thread = new TestThread[10];
		for (int i = 0; i < thread.length; i++) {
			thread[i] = new TestThread();
		}
		for (int j = 0; j < thread.length; j++) {
			thread[j].start();
		}
		
		testRuntime();
	}
	
	public static void testRuntime() {
		Runtime r1 = Runtime.getRuntime();  
		Runtime r2 = Runtime.getRuntime();  
		//“==”为地址判断，为true表示：r1与r2指向同一对象。  
		System.out.println(r1 == r2);	// 输出 true
	}

}
