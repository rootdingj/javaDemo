package com.ooad.day_02;

import java.util.ArrayList;
import java.util.List;

public class CowFactory {

	private List<Cow> list;
	
	public CowFactory() {
		list = new ArrayList<Cow>();
		list.add(new Cow(5));
	}
	public void addCow(){
		for(int i=0;i<20;i++){
			for(int j=0;j<list.size();j++){
				if(list.get(j).getAge()>=5)
					list.add(new Cow(1));
			}
			addAge();
		}
	}
	
	public  void addAge(){
		for(int i=1;i<list.size();i++){
			
			list.get(i).setAge(list.get(i).getAge()+1);
		}
	}
	
	public int getCowNum(){
		return list.size();
	}
	public static void main(String[] args) {
		
		CowFactory c = new CowFactory();
		c.addCow();
		System.out.println("20年后牛的数量"+c.getCowNum());
	}
}
