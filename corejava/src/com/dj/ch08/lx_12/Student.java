package com.dj.ch08.lx_12;

public class Student implements Comparable{
	private int id;
	private String name;
	private int score;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Student() {
	}
	
	public Student(int id,String name,int score){
		this.id = id;
		this.name = name;
		this.score = score;
	}
	public String toString(){
		return "id="+id+"\t"+"name="+name+"\t"+"score="+score;
	}
	@Override
	public int compareTo(Object o) {
		if(o instanceof Student){
			Student s = (Student) o;
			
			return this.getId()-s.getId();
		}
		return -1;
	}
	
	
		
	
	
}
