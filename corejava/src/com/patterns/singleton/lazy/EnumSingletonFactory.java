package com.patterns.singleton.lazy;
/** 
 * enum枚举实现单例模式
 * 不暴露枚举类实现细节的封装代码 
 * */
public class EnumSingletonFactory {
	private enum MyEnumSingleton {
		singletonFactory;

		private MySingleton09 instance;

		private MyEnumSingleton() {
			// 枚举类的构造方法在类加载是被实例化
			instance = new MySingleton09();
		}

		public MySingleton09 getInstance() {
			return instance;
		}
	}

	public static MySingleton09 getInstance() {
		return MyEnumSingleton.singletonFactory.getInstance();
	}
}

//需要获实现单例的类，比如数据库连接Connection
class MySingleton09 {
	public MySingleton09() {
	}
}
