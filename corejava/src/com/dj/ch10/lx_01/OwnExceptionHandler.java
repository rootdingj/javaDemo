package com.dj.ch10.lx_01;

public class OwnExceptionHandler {
	public static void main(String[] args) {
		OwnExceptionSource o = new OwnExceptionSource();
		try {
			o.a();
		} catch (OwnException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
