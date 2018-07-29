package com.dj.ch05;

public class Teacher {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Teacher(){
		this(12);
//		super();   //二选一，都只在第一行
		new Teacher("dj",12);
		this.setAge(12);
	}
	public Teacher(String name){
		super();	//当前类的子类构造器通过super()调用
					//子类构造器调用父类构造器只是拿父类的属性和方法，不创建对象，只有子类会创建对象
		this.name = name;
	}
	public Teacher(int age){
		this("dj",12);	//在构造器中用this调用另一个重载的构造器
	}
	public Teacher(String name,int age){
		//new Teacher("dj",20); //用new关键字调用构造器，创建新对象，
		this.name = name;
		this.age = age;
	}
	
}
