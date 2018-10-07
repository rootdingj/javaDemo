package com.source.pfinal;

import java.util.Random;

public class FinalTest {
	// 编译期常量，必须要进行初始化，且不可更改
	private final String final01 = "01"; 
	// 构造器常量，在实例化一个对象时被初始化
	private final String final02; 
	private static Random random = new Random();
	// 使用随机数来进行初始化（要在运行期才能知道其值，编译期并不知道）
	private final int final03 = random.nextInt(50); 
	// final指向引用数据类型
	public final Person final04 = new Person("04"); 

	FinalTest(String final02) {
		this.final02 = final02;
	}

	@Override
	public String toString() {
		return "FinalTest [final01=" + final01 + ", final02=" + final02 + ", final03=" + final03
				+ ", final04=" + final04.getName() + "]";
	}

	public static void main(String[] args) {
		System.out.println("------------第一次创建对象------------");
		FinalTest final1 = new FinalTest("f01");
		System.out.println(final1);
		System.out.println("------------第二次创建对 象------------");
		FinalTest final2 = new FinalTest("f02");
		System.out.println(final2);
		System.out.println("------------修改引用对 象--------------");
		final2.final04.setName("f04");
		System.out.println(final2);
	}

}
