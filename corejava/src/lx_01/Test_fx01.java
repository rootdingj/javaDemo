package lx_01;

import java.util.Scanner;

public class Test_fx01 {
	
	/**
	 * 知识点一: switch 分支语句
	 *a. expr的类型必须是byte, short, char或者int;不可以为boolean
     *b. valuesN类型必须是byte, short, char或者int, 该值必须是常量。各个case子句的valueN值不同；
     *c. 当switch表达式的值不与任何case子句匹配时，程序执行default子句，假如没有default子句，则程序直接退出switch语句。
     *default子句可以位于switch语句中的任何位置。
     *d. 如果switch表达式与某个case表达式匹配，或者与default情况匹配，就从这个case子句或default子句开始执行。
     *假如遇到break，就退出整个switch语句，否则依次执行switch语句中后续的case子句，不再检查case表达式的值。
     *e. switch语句的功能也可以用if...else语句来实现。但switch语句会使程序更简洁，可读性更强。而if...else功能更为强大。
	 * */
	//1、 写一个方法，能实现数值星期和中文星期的转换，如0会转换为星期天, 1会转换为星期一。
	public static void test1(){
		while(true){
			Scanner input = new Scanner(System.in);
			System.out.println("请输入一个0~6的整数:"+"\n");
			int num = input.nextInt();
			if(num==7)break;
			switch (num) {
			case 0:
				System.out.println("今天是星期天"+"\n");
				break;
			case 1:
				System.out.println("今天是星期一"+"\n");
				break;
			case 2:
				System.out.println("今天是星期二"+"\n");
				break;
			case 3:
				System.out.println("今天是星期三"+"\n");
				break;
			case 4:
				System.out.println("今天是星期四"+"\n");
				break;
			case 5:
				System.out.println("今天是星期五"+"\n");
				break;
			default:
				System.out.println("今天是星期六"+"\n");
				break;
			}
		}
	}
	
    //2、 写一个方法，返回指定月份最后一天到底是多少号？
	public static void test2(){
		while(true){
			Scanner input = new Scanner(System.in);
			System.out.println("请输入一个1~12的整数:"+"\n");
			int num = input.nextInt();
			if(num==0)break;
			switch (num) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("本月最后一天是31号");
				break;
			case 2:
				System.out.println("本月最后一天是28号");
				break;
			case 4:
				System.out.println("本月最后一天是30号");
				break;
			default:
				break;
			}
		}
	}
	
	/**
	 * 知识点二：跳出循环
	 *  break: 终止当前或指定循环；
	 *  continue: 跳过本次循环，执行下一次循环，或执行标号标识的循环体。
	 *  label: 标号用来标识程序中的语句，标号的名字可以是任意的合法标识符。
	 * */
	//3、break
	public static void test3(){
		int sum = 0;
		int i=0;
		while(sum<20){
			i++;
			sum+=i;
			if(i==5)break;
		}
		System.out.println(sum+"...................");
		while(true){
			int result=0;
			for(int j=0;j<20;j++){
				System.out.println(j+"....break");
				if(j%2==0)break;
			}
		}
	}
	
	//contiue
	public static void test4(){
		// 实现指定范围内奇数的和；
			int result=0;
			for(int k=0;k<10;k++){
				if(k%2==0)continue;
				result+=k;
				System.out.println(result+"....continue");
			}
	}
	
	//label:观察三个效果有什么不同:
	public static void test5_1(){
		for(int i=0;i<6;i++){
			for(int j=0;j<6;j++){
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println(".........");
	}
	public static void test5_2(){
		for(int i=0;i<6;i++){
			for(int j=0;j<6;j++){
				System.out.print(j);
				if(j==3){
					break;
				}
			}
			System.out.println();
		}
		System.out.println("........");
	}
	public static void test5_3(){
		f1:for(int i=0;i<6;i++){
			for(int j=0;j<6;j++){
				System.out.print(j);
				if(j==3){
					break f1;
				}
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
//		test1();
//		test2();
//		test3();
//		test4();
		
/*		test5_1();
		test5_2();
		test5_3();*/
		
	}
}
