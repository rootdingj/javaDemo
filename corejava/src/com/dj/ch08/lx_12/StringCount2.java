package com.dj.ch08.lx_12;

import java.util.Set;
import java.util.TreeSet;

public class StringCount2 {

	private String str = "";
	private Set<String> treeSet = new TreeSet<String>();
	
	public void toRepeat(String str){
		for(int i=0;i<str.length();i++){
			/*treeSet具有去重的特点，并且是有序的
			 * str.charAt(i)取出来的是字符型，需要+""来使它变成String类型
			 * */
			treeSet.add(""+str.charAt(i));
		}
	}
	public String newString(){
		for(String a:treeSet){
			str=str+a;
		}
		return str;
	}
	public static void main(String[] args) {
		StringCount2 count = new StringCount2();
		String str = "wwqweqdasdafdsfdsferer";
		count.toRepeat(str);
		System.out.println(count.newString());
	}
}
