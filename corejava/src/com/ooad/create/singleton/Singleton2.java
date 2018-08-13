package com.ooad.create.singleton;

//饿汉模式(直接给静态成员变量实例化对象)
public class Singleton2 {
	//1.类中定义一个private static修饰的当前类的类型的变量(未初始化)
	private static Singleton2 sing = new Singleton2();
	//2.当前类的构造器用private修饰
    private Singleton2() {
        
    }
    //3.提供一个public static修饰的方法,用来获得当前类的单例对象.
    public static Singleton2 getInstance() {
        return sing;
    }

}
