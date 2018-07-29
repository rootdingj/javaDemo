package com.dj.ch08.lx_02;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet(new MyComparator());
		t.add("HashSet");
		t.add("ArrayList");
		t.add("TreeMap");
		t.add("HashMap");
		t.add("TreeSet");
		t.add("LinkedList");
		
		Iterator it = t.iterator();
		while(it.hasNext()){
			Object o = it.next();
			System.out.println(o);
		}
		
		TreeSet t1 = new TreeSet(new MyComparator2());
		for(int i=1;i<=10;i++){
			Integer i1 = new Integer(i);
			t1.add(i1);
		}
		
		it = t1.iterator();
		while(it.hasNext()){
			Object o1 = it.next();
			System.out.println(o1);
		}
	}
}

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {

		String s1 = (String)o1;
		String s2 = (String)o2;
		
		return s1.compareTo(s2);  //ÉýÐò
	//	return -s1.compareTo(s2); //½µÐò
	}
}

class MyComparator2 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		int num1 = ((Integer)o1).intValue();
		int num2 = ((Integer)o2).intValue();
		
		int type1 = num1%2;
		int type2 = num2%2;
		if(type1>type2)
			return -1;
		else if(type1<type2)
			return 1;
		else
			if(type1==0){
				if(num1>num2)
					return -1;
				else if(num1<num2)
					return 1;
			}else if(type1==1){
				if(num1>num2)
					return -1;
				else if(num1<num2)
					return 1;
			}
		return 0;
	}
}