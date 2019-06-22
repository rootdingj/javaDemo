package com.dj.base.ch06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 泛型：
 * 	  .泛型可以使类中的属性类型可以由外部决定;
 * 	  .不需要强制类型转换;
 *    .泛型可以在*编译期间*进行类型检查;
 *    .提供了类型安全的操作
 * 
 * */
public class GenericTest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(1);
		List<Integer> a1 = new ArrayList<Integer>();
		List<Integer> a2 = new ArrayList<Integer>();
		List a3 = new ArrayList<Integer>();
		//类型参数不同的泛型类型不能互相引用, 不考虑类型参数间的继承性
//		List<Object> a2 = new ArrayList<Integer>();  false
		//验证：泛型只是用来给编译器检查语法的，运行的时候会自动的擦除泛型
		List list1 ;
		List<Object> olist;
		List<String> slist = new ArrayList<>();
//		olist = slist; //不匹配
		list1 = slist;
		olist = list1;
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("dj", 123);
		
		int result = 0;
		for(Object o:list){
			Integer i = (Integer) o;
			result+=i;
		}
		//强转毕竟有风险，改进
		for(Integer i:list){
			result+=i;
		}
		System.out.println(result);
	}
}
