package com.dj.ch07;

public class Student {
	
	private long id;
	private String name;
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
	public Student(long id,String name){
		this.id = id;
		this.name = name;
	}
	//多态的灵活性-调用不到就-判断-强转
	@Override
	public boolean equals(Object o) {
		//s3.equals(null):先判断对象中是否为空，避免空指针
		if(o==null){
			return false;
		}
		//s3.equals(new Teacher()):判断这对象是不是属于这个类
		if(!(o instanceof Student)){
			return false;
		}
		//s3.equals(s3)：判断这个对象是不是当前的对象他本身
		if(this ==o){  
			return true;
		}
		Student s = (Student)o;  //强转，短路与判断是否相等
		if(this.id==s.getId()&&this.name.equals(s.getName())){
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "id="+id+",name="+name;
	}
}
