package com.dj.ch08.lx_02;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest2 {
	public static void main(String[] args) {
		Set<Integer> s = new TreeSet<Integer>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				/*前面两个if判断奇数在前偶在后，奇、偶谁大谁小我说了算
				 * TreeSet算法按 1 3 5 7 从小到大排列
				 * 后面的else控制升降序
				 * 数字的比较是误区
				 * */
				//o1为奇数，o2为偶数，两个if确定奇数排在前面
				if(o1%2==1&&o2%2==0){
					return -1;			//O1(奇数)——O2(偶数)为负，o1小排在前面	
				}
				//O1为偶数，O2为奇数	
				if(o1%2==0&&o2%2==1){  
					return 1;			//O1(偶数)——O2(奇数)为负，o1大排在后面
				}
				if(o1%2==0&&o2%2==0){ 
					return -(o1-o2);
				}
				if(o1%2==1&&o2%2==1){
					return o1-o2;
				}
				else{					//判断小的数排在前面,通过-控制奇数或偶数的排序
					return -o1+o2;
				}
			}
		});
		s.add(10);
		s.add(8);
		s.add(2);
		s.add(1);
		s.add(7);
		s.add(6);
		s.add(3);
		s.add(5);
		s.add(4);
		s.add(9);
		
		for(Object o:s){
			System.out.println(o);
		}
	}
}
