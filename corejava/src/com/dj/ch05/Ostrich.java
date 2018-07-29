package com.dj.ch05;

public class Ostrich extends Bird{
	
	/*重写父类的方法：方法名、参数列表一样
	 * 
	 * */
	public void fly(){
		System.out.println("哥飞不起来 ....");
	}
	
	public static void main(String[] args) {
		Ostrich os = new Ostrich();
		os.fly();
		
		System.out.println("........测试...........");
		new Son();  //打印 Father()
	}
	
}
/*1.在子类构造方法中如没有使用this关键字，会隐式调用父类的无参构造方法；
 *2.子类构造器隐式地调用父类的默认无参构造器;
 * 
 *3.new Son()-->父类的无参构造函数--> 子类的有参构造-->子类无参构造
 * */

class Father{
	public Father(){
		//super(); 不写的话也会默认这句代码
		System.out.println("父类的无参构造");
	}
	public Father(String name){
		System.out.println("父类有参构造"+name);
	}
}

class Son extends Father{
	public Son(){
		//super("dj");
		this("dj2");
		System.out.println("子类的无参构造");
	}
	public Son(String name){
		System.out.println("子类有参构造"+name);
	}
}

