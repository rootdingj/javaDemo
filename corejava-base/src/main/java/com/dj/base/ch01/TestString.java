package com.dj.base.ch01;

public class TestString {

	public static void testString() {
		String str1 = "123";
		String str2 = new String("123");
		System.out.println("str1:" + str1 + ",str2:" + str2);
		System.out.println("str1==str2?" + str1 == str2); // false
		System.out.println(str1.equals(str2)); // true

	}

	public static void testStringBuilder() {

	}

	public static void main(String[] args) {
		testString();
	}

}
