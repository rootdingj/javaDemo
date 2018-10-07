package com.source.plong;

import java.lang.reflect.Field;

public class StringTest {
	
	/** 
	 * @Title: strIschangeTest 
	 * @Description: 通过反射，我们改变了底层的字符数组的值，实现了字符串的 “不可变” 性</br>
	 * 				 违反了 Java 对 String 类的不可变设计原则，会造成一些安全问题(不建议使用)
	 * @return void    返回类型
	 */
	public static void strIschangeTest() {
//		String str = "Hello Test";	// 可变（final: 构造器常量）
		final String str = "hello test"; // 不可变（final: 编译期常量）
		System.out.println("str1: "+str);
		try {
			Field field = String.class.getDeclaredField("value");
			field.setAccessible(true);
			char[] value = (char[])field.get(str);
			value[6] = 'J';
			value[7] = 'a';
			value[8] = 'v';
			value[9] = 'a';
			System.out.println("str2: "+str);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		strIschangeTest();
		
	}

}
