package lx_01;

class Test_fx03 {

	/**
	 * return测试：test1、test2
	 * 笔记：	注意:return_type:如果方法定义了返回类型,那么在方法体里面就必须出现return语句,
	 * 		而且返回的数据类型要和声明一致,如果没有返回类型的话(void),那么方法体里面可以写return,
	 * 		也可以不写return。当代码执行了return语句,那么代码就不往下执行了,直接退出这个方法并返回
	 * 
	 * 修正：finally是唯一一个可以在return后面执行的语句块，
	 * 	           排除finally语句块，在一个垂直执行的程序中，return后面的代码是不鞥呢通过编译的
	 * 		在try-catch-finally语句中，他们的执行流程也是必须明白的
	 * 
	 * */
	@SuppressWarnings("finally")
	public static void test1(){
		int a = 0;
		try{
			a = 10;
			System.out.println("输出a="+a);
			return;
		}catch(Exception e){
			a=20;
			System.out.println("输出a="+a);
			System.out.println(e+".........");
			return;
		}finally {
			a=30;
			System.out.println("输出a="+a);
			return;
		}
	}
	
	public static int test2(){
		int a = 0;
		try{
			a = 10;
			System.out.println("输出a="+a);
			return a;
		}catch(Exception e){
			a=20;
			System.out.println("输出a="+a);
			System.out.println(e+".........");
			return a;
		}finally {
			a=30;
			System.out.println("输出a="+a);
//			return a;
		}
//		System.out.println("a="+a);
//		return a;
	}
	
	public static void main(String[] args) {
//		test1();
		test2();
		
		
	}
	
}
