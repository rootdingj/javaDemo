package com.dj.ch08.lx_03;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTestInner {
	public static void main(String[] args) {
//		TreeSet c = new TreeSet(new MyComparator()); 
		@SuppressWarnings("unchecked")
		TreeSet c = new TreeSet(new Comparator(){
			public int compare(Object o1, Object o2){
				String s1 = (String)o1;
				String s2 = (String)o2;

				return -s1.compareTo(s2);
			}
		});   
		new HashMap();
		c.add("HashSet");
		c.add("ArrayList");
		c.add("TreeMap");
		c.add("HashMap");
		c.add("TreeSet");
		c.add("LinkedList");
    
		Iterator it = c.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

	static class MyComparator implements Comparator{
		public int compare(Object o1, Object o2){
			String s1 = (String)o1;
			String s2 = (String)o2;
			return s1.compareTo(s2);
		}
	}
}
