package com.dj.ch08.lx_11;


public class ArrayList implements List{

	private Object[] objects;
	private int size;
    public ArrayList() {
    	objects = new Object[30];
    }
    public void expend(Object o){
    	Object[] objects2 = new Object[objects.length*3];
    	System.arraycopy(objects, 0, objects2, 0, objects.length);
    	objects = objects2;
    }
    
	@Override
	public boolean add(Object o) {
		if(size<objects.length){
    		objects[size++] = o;
    		return true;
    	}else{
    		expend(o);
    		objects[size++] = o;
    		return false;
    	}
	}

	@Override
	public void clear() {
		for(int i=0;i<size;i++){
			objects[i] = null;
		}
		size = 0;
	}

	@Override
	public boolean contains(Object o) {
		for(int i=0;i<size;i++){
			if(o.equals(objects[i]))
				return true;
		}
		return false;
	}

	@Override
	public Object get(int index) {
		
		return objects[index];
	}

	@Override
	public int indexOf(Object o) {
		
		if(o == null){
			for(int i=0;i<size;i++)
				if(objects[i]==null)
					return i;
			}else{
				for(int i=0;i<size;i++)
					if(o.equals(objects[i]))
						return i;
			}
		
		return 0;
	}

	@Override
	public boolean remove(Object o) {
		if(indexOf(o)==-1){
			return false;
		}
		objects[indexOf(o)]=null;
		return true;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public IteratorImp iterator() {
		 return new IteratorImp(objects,size);
	}

}
