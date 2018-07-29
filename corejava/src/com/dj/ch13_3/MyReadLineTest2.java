package com.dj.ch13_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MyReadLineTest2 {
	
	public static void main(String[] args) {
		InputStream in = null;
		MyReadLine mrl = null;
		try {
			String filePath = "src/com/dj/ch13_3/Hello";
			in = new FileInputStream(filePath);
			mrl = new MyReadLine(in);
			String str = null;
			Student stu = null;
			List<Student> list = new ArrayList<Student>();
			while((str=mrl.readLine())!=null){
				//1:tom1:21
				//{"1","tom1","21"}
				String[] s = str.split("[:]");
				long id = Long.parseLong(s[0]);
				String name = s[2];
				int age = Integer.parseInt(s[2]);
				stu = new Student(id,name,age);
				list.add(stu);
			}
			for(Student s:list){
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(in!=null)in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

class Student{
	private long id;
	private String name;
	private int age;
	public Student() {}
	public Student(long id, String name, int age) {
		this.id = id;
		this.name = name;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "id="+id+",name="+name+",age="+age;
	}
}


