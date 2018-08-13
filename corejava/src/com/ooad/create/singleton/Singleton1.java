package com.ooad.create.singleton;

//懒汉模式(在静态方法中实例化对象)
public class Singleton1 {
	//1.类中定义一个private static修饰的当前类的类型的变量
	private static Singleton1 sing;

	//2.当前类的构造器用private修饰
    private Singleton1() {
        
    }
    
    //3.提供一个public static修饰的方法,用来获得当前类的单例对象.
    public static Singleton1 getInstance() {
        if (sing == null) {
            sing = new Singleton1();
        }
        return sing;
    }

}
