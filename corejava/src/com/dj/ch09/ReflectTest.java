package com.dj.ch09;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class ReflectTest {
	public static void main(String[] args) throws Exception {
		Student s = new Student("dj");
		
		//获得一个类的Class类型对象
		Class c1 = s.getClass();   //虚拟机中已经有了Class的实例对象
		Class c2 = Student.class;
		
		String className = "ch09.Student"; //虚拟机中没有Class的实例对象,通过反射.properties文件中的包名，获得类对象
		Class c3 = Class.forName(className);
		
/*		//测试属性抽象类，和访问权限的设置
		Field f = c1.getField("pub_name");
//		Field f2 = c1.getField("pri_name");  //只有public可以直接访问，私有...属性，需设置访问权限可访问的 setAccessible()
		System.out.println(f.getType());
		System.out.println(f.getModifiers()); //获得修饰符参数值
		System.out.println(f.getName()); //获得修饰符参数值
		System.out.println(f.get(s)); //获得修饰符参数值,镜子里面：属性.get(包含属性的对象)
		System.out.println("............................");
		
		Field[] fields = c1.getDeclaredFields();
		for(Field fi:fields){
			fi.setAccessible(true);//设置私有属性等的可见性
			System.out.println(fi.getType());
			System.out.println(fi.getModifiers());
			System.out.println(fi.getName());
			System.out.println(fi.get(s));
		}*/
		
		//方法抽象类
		@SuppressWarnings("unchecked")
		Method method1 = c1.getMethod("say"); //获得Method类的对象
		method1.invoke(s); //invoke()通过Student的对象s找到Student类中的方法 
		//通过方法名和参数列表（将参数列表封装成一个Class对象）确定你要的方法
		@SuppressWarnings("unchecked")
		Method method2 = c1.getMethod("say",new Class[]{String.class,int.class});
		method2.invoke(s,new Object[]{"dj",6});
		
	/*	//无参构造函数
		Student o = (Student) c1.newInstance();
		ReflectTest re = new ReflectTest();
		Student stu1 = (Student) re.getObj("com.dj.ch06_4.Student");
		stu1.run();*/
		
		//有参构造
		Constructor constructor = c1.getConstructor(new Class[]{String.class});
		Student stu1 = (Student) constructor.newInstance(new Object[]{"dj"});
		System.out.println(stu1.getPri_name());
	}
	
	
	//String name = "Student" 
	//com.dj.ch06_4.Student
	public Object getObj(String className) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		Class c = Class.forName(className);
		Object o = c.newInstance();
		return o;
//		return Class.forName(className).newInstance();
	}

	
}
