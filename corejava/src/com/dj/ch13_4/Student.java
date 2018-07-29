package com.dj.ch13_4;

import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * 添加序列化编号，它对以后类的修改起作用
	 * 如果没有序列化编号，修改了类中的属性等的话就会报错
	 */
	private static final long serialVersionUID = -7854393115582398207L;
	private long id;
	private String name;
	//transient：透明的；这个属性的值在序列化的时候会被忽略,过滤掉age值，对女生年龄是隐私
	private transient int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(long id, String name) {
		this.id = id;
		this.name = name;
	}
	public Student(long id, String name,int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Student() {
	}
	public String toString() {
		return "id="+id+",name="+name+",age="+age;
	}
	
}
