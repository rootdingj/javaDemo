package com.ooad.create.singleton;

public class Test1 {
	public static void main(String[] args) {
        Singleton1 sing = Singleton1.getInstance();
        Singleton1 sing2 = Singleton1.getInstance();
        
        System.out.println(sing);
        System.out.println(sing2);
        
    }

}
