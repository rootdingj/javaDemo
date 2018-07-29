package com.dj.ch10.lx_01;

public class OwnException extends Exception{
	private String msg;

	public OwnException(){
		this("");
	}

	public OwnException(String msg) {
		this.msg = msg;
	}
	
	public void go(){
		System.out.println("......");
	}
}

class OwnExceptionSource{
	
	public void a() throws OwnException{
		System.out.println("haofan.....");
	}
}