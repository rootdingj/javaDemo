package com.dj.ch06;

/*静态方法、属性属于类的(经常要用的就恰到好处、适当的用，占内存),非静态的属于对象的
 * 
 * */
public class StaticTest4 {
	public static int a; 
	private int b;

	public void test(){
		a++;
		b++;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

	public static void main(String[] args){
		
		//System.out.println("");
		StaticTest4 s1 = new StaticTest4();
		s1.test();
		StaticTest4 s2 = new StaticTest4();
		s2.test();
		StaticTest4 s3 = new StaticTest4();
		s3.test();
		StaticTest4 s4 = new StaticTest4();
		s4.test();
	}
}
