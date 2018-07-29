package com.dj.ch10;

public class AssertTest {
	public static void main(String[] args) {
		AssertTest t = new AssertTest();
		t.test(-1);
		t.test(10);
	}
	//整数  负数
	public void test(int a){
		assert a>0:"测试期间传值";  //设置一下
		System.out.println(a);
	}
}
