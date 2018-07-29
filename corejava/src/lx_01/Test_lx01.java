package lx_01;

import java.util.Scanner;

public class Test_lx01 {

	/**
	 * 斐波那契数列：
	 * 0 1 1 2 3 5 8 13 21
	 * 
	 * */
	public static void test1(){
		Scanner input = new Scanner(System.in);
		System.out.println("输入数列中总共有多少个数：");
		int n = input.nextInt();
		long[] num = new long[n];
		num[0]=0;
		if(n>0)num[1]=1;
		for(int i=2;i<n;i++){
			num[i]=num[i-1]+num[i-2];
		}
		System.out.println("数列为：");
		for(int j=0;j<n;j++){
			System.out.print(num[j]+" ");
		}
	}
	
	/**
	 * 题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？(排列：24,&& ，if，for)
	 * 程序分析：可填在百位、十位、个位的数字都可以是1、2、3、4。组成所有的排列后再去掉不满足条件的排列。
	 * 
	 * */
	public static void test2(){
		int num;
		int count = 0;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				for(int k=1;k<=4;k++){
					if(i!=j&i!=k&j!=k){
						num = i*100+j*10+k;
						count++;
						//continu;
						System.out.print(num+"\t");
					}
				}
			}
		}
		System.out.println();
		System.out.println("有"+count+"个符合条件的三位数");
	}
	
	/**
	 * 3,打印出所有的“水仙花数”，所谓“水仙花数”是指一个三位数，其各位数字立方和等于该数本身。
	 * 例如：153是一个“水仙花数”，因为153=1的三次方＋5的三次方＋3的三次方。
	 * 	以下数为水仙花数:
			 153 370 371 407
	 * /和%的运用，拿个例子试一下
	 * */
	public static void test3(){
		 System.out.println("以下数为水仙花数:");
		    for(int i=100;i<1000;i++){
		      int a=i/100;//表示百位的数；
		      int b=i/10%10;//表示十位的数；
		      int c=i%10;//表示个位的数;
		      if(i==Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)){
		      System.out.print(" "+i);
		    }
		 }
	}
	/**
	 * 求1000以内的完全数
	 * 若一个自然数，恰好与除去它本身以外的一切因数的和相等，这种数叫做完全数。
	 * */
	public static void test4(){
		System.out.println("1~1000以内的完全数有:");
		  for(int i=1;i<=1000;i++){
		     int sum=0;
		     for(int j=1;j<=i/2;j++){
		      if(i%j==0){
		       sum+=j;
		     }
		     }
		    if(sum==i){
		     System.out.print(" "+i);
		     }
		  }
	}
	
	/**
	 * 以二进制形式输出一个十进制数利用for循环和移位以及&运算
	 * */
	public static void test5(){
		//法一:原理就类似于用竖式将十进制化成二进制的过程
		Scanner input  = new Scanner(System.in);
		System.out.println("输入一个十进制正整数：");
		int num = input.nextInt();
		
		/*int i = 1;
		int[] b = new int[8];
		int a;
		a = num;	
		while(a!=0){
			b[i] = a%2; //对2求余，余数不是1就是0,也就是相应的二进制位
			a = a/2;   //对2取整，通过判断整数是否为0来结束循环
			i++;
		}
		for(i=7;i>=0;i--){		
		System.out.print(b[i]);
		}*/
		
		/*//法三：老师的方法，执行时输入数字(命令航中执行，IDE中配置一下run也可以)。32位二进制位的1通过j的for循环
		   System.out.print(num+"的2进制数为:");
		     int j;
		    for(j=31;j>=0;j--){		//int为32位
			 if((1<<j&num)==0){		//1左移31位最高位与a&运算，从高位开始输出.1<<31为负数
			 System.out.print("0");
			 }else{
			 System.out.print("1");
			 }
		 }
		   System.out.println("");*/
		

		//法二:int--32个二进制位，两个32位的二进制位&运算，将各个二进制位链接起来，转化为字符串的方式输出
		String str = "";
		for(int a=12;a>0;a=a>>1){
			str = (a&1)+str;   //1默认为int型
		}
		System.out.println(str);
		
		
	}
	
	/**
	 * 判断101-200之间有多少个素数，并输出所有素数。
	 * (if[] if(&&))只能被1和它本身整除的自然数为素数(质数)
	*/
	public static void test6(){
		int count = 0;
		//法一、老师答案：排除1,去找只能整除自己的数
		for(int i = 101;i < 200;i+= 2){
			for(int j=2;j<=i;j++){
				if(i%j==0&&i!=j){ //整除了，但是不是除自己，就不是素数，跳出内循环
					break;
				}else if(i%j==0){	//整除了，是自己（只能整除自己），是素数，输出
					System.out.print(i+" ");
					count++;
				}
		      }
		}
	
	/*
		//法二:排除1和本身，去找没有整除的i
		for(int i=101;i<200;i+=2){		//1=101,i+=2,排除偶数增强算法性能
			for(int j=2;j<i;j++){		//通过for循环排除1和他本身
					if(i%j==0){		//当能够整除，跳出内循环
						break;	
					}else if(j==i-1){ //不能整除就输出，并且通过j==i-1判断循环是否进行到底
						System.out.print(i+" ");
						count++;	
				}
			}
		}
	*/
	     System.out.println("\n" + "Total "+ count + " prime number between 101 and 200");
	}
	
	/**
	 * 求两个数的最大公约数，最小公倍数
	 * */
	public static void test7(){
		Scanner input = new Scanner(System.in);
		System.out.println("请向控制台输入一个数：");
		int a = input.nextInt();
		System.out.println("再次向控制台输入一个数：");
		int b = input.nextInt();
		int pro=a*b;
		   int t=0;
		   if(a<b){
		   t=a;
		   a=b;
		   b=t;
		   } 
		   while(b!=0){
		    t=a%b;
		    a=b;
		    b=t;
		  }
		  System.out.println("两个数的最大公约数为:"+a);
		  System.out.println("两个数的最小共倍数为:"+pro/a);
	}
	
	public static void main(String[] args) {
//		test1();
//		test2();
//		test3();
//		test4();
//		test5();
//		test6();
//		test7();
	}
	
}
