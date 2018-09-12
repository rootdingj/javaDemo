package com.patterns.singleton.lazy;

/** 
 * 懒汉式
 * 方法中声明synchronized关键字
 *  */
public class MySingleton01 {
	
	private static MySingleton01 instance = null;
	
	private MySingleton01() {}
	
	public synchronized static MySingleton01 getInstance() {
		if(instance != null) {
			// 不创建
		}else {
			//创建实例之前可能会有一些准备性的耗时工作 
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			instance = new MySingleton01();
		}
		// 从结果上来看，问题已经解决了，但是这种实现方式的运行效率会很低。同步方法效率较低，那接下来使用同步代码块来实现
		return instance;
	}

}
