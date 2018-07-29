package com.dj.ch08.lx_12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class StudentTest {
	public static void main(String[] args) {
		Comparator<Student> c = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getName().equals("tom"))
					return -1;
				if(o2.getName().equals("tom"))
					return 1;
				else{
					if(o1.getScore()==o2.getScore()){
						return o1.compareTo(o2);
					}else
						return -(int)(o1.getScore()-o2.getScore());
				}	
			}
		};
		TreeSet<Student> t = new TreeSet();
		
		Student s1 = new Student(1, "dj", 70);
		Student s2 = new Student(2, "dj", 20);
		Student s3 = new Student(3, "dj", 60);
		Student s4 = new Student(4, "dj", 40);
		Student s5 = new Student(5, "tom",70);
		Student s6 = new Student(6, "dj", 80);
		Student s7 = new Student(7, "dj", 90);
		Student s8 = new Student(8, "dj", 90);
		Student s9 = new Student(9, "dj", 80);
		
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		t.add(s5);
		t.add(s6);
		t.add(s7);
		t.add(s8);
		t.add(s9);
		
		for(Object o:t){
			System.out.println(o);
		}
/*		Object[] o = t.toArray();
		System.out.println(Arrays.toString(o));*/
/*		Iterator it =t.iterator();
		while(it.hasNext()){
			Student s=(Student)it.next();
			System.out.println(s);
		}*/
	}
}
