package com.dj.ch09;

public class GenderTest {
	public static void main(String[] args) {
		Gender g1 = Gender.B;
		Gender g2 = Gender.G;
		
		g1.setName("bo");
		g1.test();
		
		g2.setName("girl");
		g2.test();
		
		GenderTest ge = new GenderTest();
		
/*		//可写的东西太多了，什么String都可以往里面放，那就会有好多种性别了
 * 		ge.run("nan");
		ge.run("nv");
		ge.run("....");
		*/
		ge.run(Gender.B);
		ge.run(Gender.B);
	}
/*	public void run(String string){
		
	}*/
	public void run(Gender gender){
		
	}
	
}
