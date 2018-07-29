package com.dj.ch08.lx_11;

import java.util.Iterator;

public interface List {
	
	boolean add(Object o);
	void clear();
	boolean contains(Object o);
	Object get(int index);
	int indexOf(Object o);
	boolean remove(Object o);
	int size();
	IteratorImp iterator();
	
}
