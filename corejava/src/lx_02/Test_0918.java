package lx_02;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import com.dj.ch08.Student;

public class Test_0918 {

	public static void main(String[] args) {
		test2();
//		test3();
//		test4();
		test5();
	}
	public static void test2(){
		BigDecimal sum = new BigDecimal(1);
		for(int i=1;i<=990;i++){
				 sum = sum.multiply(new BigDecimal(i));
				 System.out.println(sum);
		}
		System.out.println(sum.toString().length());
	}
	public static void test3(){
		int sum=1;
		for(int i=9;i>=1;i--){
			sum=(sum+1)*2;
		}
		System.out.println(sum);
	}
	public static void test4(){
		try {
			System.out.println(
					new String("中国".getBytes(),"gbk"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void test5(){
		System.out.println("请输入参与游戏的人数：");
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		int temp = Integer.parseInt(line);
		Map<Student, Boolean> map = new HashMap();
		for(int i=1;i<=temp;i++){
			map.put(new Student(i, "dj"+1), true);
		}
		int flag=0;
		while(map.size()>=2){
			Iterator it = map.keySet().iterator();
			while(it.hasNext()){
				Object obj = it.next();
				flag++;
				if(flag==3){
					it.remove();
					flag=0;
				}
			}
		}
		System.out.println(map);
	}
}
