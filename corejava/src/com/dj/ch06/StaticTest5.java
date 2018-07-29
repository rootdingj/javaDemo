package com.dj.ch06;

import static java.lang.System.out;
import static java.lang.Math.random;

/*æ≤Ã¨µº»Î≤‚ ‘
 * */
public class StaticTest5{

	public void test(){
		System.out.println("hello");
		out.println("hello");
		p("hello");
		System.out.println(random());
	}
	public void p(Object o){
		out.println(o);
	}

	public static void main(String[] args){
		StaticTest5 s = new StaticTest5();
		s.test();
	}

}