package com.dj.ch09;

import java.util.ArrayList;
import java.util.List;

public class GenericTest3 {
	public static void main(String[] args) {
		List<Integer> list =new ArrayList();
		list.add(1);
		list.add(2);
//		list.add("1");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("dj1");
		list2.add("dj2");
		
		Teacher t = new Teacher();
		t.println(list);
		t.println(list2);
	}
}


class Teacher{
	public void println(List<?> list){
		for(Object o:list){
			System.out.println(o);
		}
	}
}