package com.dj.ch08;

public class Student{
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
	public Student(long id, String name) {
		this.id = id;
		this.name = name;
	}
	public Student() {
	}
	
	@Override
	public int hashCode() {
		return (int) id;
	}
	
	/*@Override
	public int compareTo(Object o) {
		//Student s1 ...  Student s2 ...
		//s1.compareTo(s2)
		//this   o
		Student s = (Student) o;
		//this.id - s.getId()
		if(this.id<s.getId()){
			return -520;
		}
		//this.id - s.getId()
		if(this.id>s.getId()){
			return 110;
		}
		//this.id - s.getId()
		return -(int)(this.id-s.getId());
	}*/
	@Override
	public String toString() {
		return "id="+id+",name="+name;
	}
}
