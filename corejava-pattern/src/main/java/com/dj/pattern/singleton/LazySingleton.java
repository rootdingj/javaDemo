package com.dj.pattern.singleton;

public class LazySingleton {

	private static LazySingleton uniqueInstance = null;

	private LazySingleton() {

	}

	public static LazySingleton getUniqueInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new LazySingleton();
		}
		return uniqueInstance;
	}

}
