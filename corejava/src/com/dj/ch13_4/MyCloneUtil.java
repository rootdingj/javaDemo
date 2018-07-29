package com.dj.ch13_4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("unchecked")
public class MyCloneUtil {
	private MyCloneUtil() {
		throw new AssertionError(); 
	} 
	public static <T extends Serializable> T clone(T obj) throws Exception { 
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bout); 
		oos.writeObject(obj); 
		ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bin);
		return (T) ois.readObject(); 
		//说明：调用ByteArrayInputStream或ByteArrayOutputStream对象的close方法没有任何意义 
		//这两个基于内存的流只要垃圾回收器清理对象就能够释放资源，这一点不同于对外部资源（如文件流）的释放 
	}
	
	public static void CloneTest(){
		try { 
			Person p1 = new Person("Hao LUO", 33, new Car("Benz", 300)); 
			Person p2 = MyCloneUtil.clone(p1); //深度克隆 
			p2.getCar().setBrand("BYD");  
			//修改克隆的Person对象p2关联的汽车对象的品牌属性 
			//原来的Person对象p1关联的汽车不会受到任何影响 
			//因为在克隆Person对象时其关联的汽车对象也被克隆了
			System.out.println(p1); 
			} catch (Exception e) { 
				e.printStackTrace(); 
		}
	}
	
	public static void main(String[] args) {
		CloneTest();
	}
	
}
