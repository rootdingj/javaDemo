package com.dj.base.ch02;

/**
 * 
 * @ClassName: StaticTest2 
 * @Description: new一个对象的时候JVM都做了那些事情
 * @author Steven 
 * @date 2019年6月7日
 */
public class StaticTest2 {
	
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
	public StaticTest2() {
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
//		System.out.println(name);     
		new StaticTest2(); 			 
//		say();			  		      
//		new StaticTest3().test();     
	}

}
