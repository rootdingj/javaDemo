package lx_01;

public class Test_fx02 {
	
	//1、数组的长度可以为0，此时数组中一个元素也没有。
	public static void test1(){
		int[] i = new int[0];
		System.out.println(i.length);
//		System.out.println(i[0]); //运行抛异常：数组下表越界ArrayIndexOfBoundsException
		System.out.println(i);
	}
	public static void test2(){
		//貌似增加了数组的长度
		int[] x = new int[3];
		int[] y = x;
		x = new int[12];
		
		//数组的声明、创建、初始化
		int[] n = {1,2,3};
		int[] m = new int[]{1,2,2};
		Student[] s = new Student[]{new Student(),new Student("sdf", 12, "male")};
		Student[] s1 = {new Student(),new Student("sdf", 12, "male")};
		
	}
	public static void main(String[] args) {
//		test1();


		
		
		
		
	}
	
}
class Student{
	private String name;
	private int age;
	private String gender;
	public Student(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public Student() {
	}
}

