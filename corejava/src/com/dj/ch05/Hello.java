package com.dj.ch05;

public class Hello {

	public static void main(String[] args) {
		A ab = new B();
        ab = new B();
        //1a2b2b
	}

}

class A {
	static {
		System.out.print("1");
	}

	public A() {
		System.out.print("2");
	}
}

class B extends A {
	static {
		System.out.print("a");
	}

	public B() {
		System.out.print("b");
	}
}