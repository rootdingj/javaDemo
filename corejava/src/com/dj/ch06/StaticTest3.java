package com.dj.ch06;

/**
<code>new一个对象的时候JVM都做了那些事情:</code></br>
<code>1.</code></br>
<code>2.</code></br>
* */
public class StaticTest3 {

	private static String name;
	private int age;
	
	//匿名代码块
	{
		name = "tom";
		age = 30;
		System.out.println("匿名代码块...");	
	}
	//静态代码块
	static{
		name = "tom";
//		age = 12; //false
		//new StaticTest3();
		System.out.println("静态代码块..."+name);	
	}
	//无参构造
	public StaticTest3() {
		this.name = "zhangsan";
		this.age = 20;
		System.out.println("无参构造方法...name="+name+" age="+age);	
	}
	//实例方法
	public void test(){
		name = "zhangsan";
		System.out.println("实例方法..."+name);
	}
	//静态方法
	public static void say(){
		name = "zhangsan";
		System.out.println("静态方法..."+name);
	}
	
	public static void main(String[] args) {
//		System.out.println(name);    //1.
		new StaticTest3(); 			 //2.
//		say();			  		     //3.
//		new StaticTest3().test();    //4.
		
	}

}
