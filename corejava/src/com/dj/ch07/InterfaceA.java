package com.dj.ch07;

public interface InterfaceA {
	int AGE = 20; 	//不写，JVM会默认给加载上下面的关键字
	public static final int BGE = 30; 	//显示声明public static final类型
	
	void say();//抽象方法的简写，默认修饰符为 public abstract
	//public abstract void say();
	
}

 interface InterfaceB{
	String NAME = "tom";
	int go(String dj);
}

//接口与接口之间是多继承
//类和类之间是单继承
interface InterfaceC extends InterfaceA,InterfaceB{ 
	
}

interface InterfaceD{
	
}
//ctrl+1
//类和接口之间是多实现：一个类可以实现多个接口
class InterfaceImpl implements InterfaceC,InterfaceD{  
	@Override
	public void say() {
		// TODO Auto-generated method stub
	}
	@Override
	public int go(String dj) {
		// TODO Auto-generated method stub
		return 0;
	}
}

   class InterfaceTest{
	   
	public static void main(String[] args) {
		System.out.println(InterfaceA.AGE);
		System.out.println(InterfaceA.BGE);
		InterfaceA a = new InterfaceImpl();
		a.say();
		InterfaceB b = new InterfaceImpl();
		b.go("");
		InterfaceC c = new InterfaceImpl();
		c.go("");
		c.say();
		InterfaceD d = new InterfaceImpl();
		//多态的灵活性，调用不到，强转一下再调用（强转前先判断一下）
		if(d instanceof InterfaceImpl){		
			InterfaceImpl i = (InterfaceImpl)d;
			i.say();
			i.go("");
		}
	}
}
class Test{
	
	public void say(){
		
	}
}
   
abstract class abTest{
	
	public abstract void  test();
}

abstract class abTest1 extends abTest{
	
	public abstract void  test();
} 

abstract class abTest2 extends Test{
	
	public abstract void  test();
} 




