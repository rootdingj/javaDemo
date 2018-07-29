package com.dj.ch10.lx_01;

public class AssertTest2 {
	public static void main(String[] args) {
		args = new String[3];
		System.out.println(args.length==2);
		
			assert args.length==2:"main方法的参数刚好是两个";
			System.out.println(args.length);
	}
}
