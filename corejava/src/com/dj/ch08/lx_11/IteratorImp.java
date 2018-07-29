package com.dj.ch08.lx_11;

public class IteratorImp implements Iterator{

	private Object[] objects;
	private int size;
	public IteratorImp(Object[] objects,int size) {
		super();
		this.objects = objects;
		this.size = size;
	}
	
	@Override
	public boolean hasNext() {
		for(int i=0;i<size;i++){
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		for(int i=0;i<size;i++){
			return objects[i];
		}
		return null;
	}
}
