package com.ooad.create.singleton;

public class Test2 {
	public static void main(String[] args) {
        Singleton2 sing = Singleton2.getInstance();
        Singleton2 sing2 = Singleton2.getInstance();
        
        System.out.println(sing);
        System.out.println(sing2);
        
    }

}
