package com.dj.ch09;

public enum Color implements Sofa{
	RED,GREEN,BLUE;
	
	private String name;

	public String getName() {
		return name;
	}
	private Color(){
		
	}
	private Color(String name){
		this.name = name;
	}
	
	@Override
	public void sit() {
		// TODO Auto-generated method stub
	}
}

interface Sofa{
	 void sit();
}