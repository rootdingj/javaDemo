package com.source.plong;

public class CloneTest {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(20);
		/*Person p2 = p1; 
		System.out.println("p1: "+p1.getAge());
		System.out.println("p2: "+p2.getAge());
		p2.setAge(22);
		System.out.println("p1: "+p1.getAge());
		System.out.println("p2: "+p2.getAge());
		System.out.println(p1 == p2);  // true 引用指向的是同一块内存地址
*/		
		/*Person p2 = p1.clone();
		System.out.println("p1: "+p1.getAge());
		System.out.println("p2: "+p2.getAge());
		p2.setAge(22);
		System.out.println("p1: "+p1.getAge());
		System.out.println("p2: "+p2.getAge());
		System.out.println(p1 == p2);  // false 指向的是不同地址，有新的内存分配
*/		
		Address address = new Address();
		address.setCity("深圳市");
		p1.setAddress(address);
		Person p2 = p1.clone();
		System.out.println("p1: "+p1.getAge()+", Address1: "+p1.getAddress().getCity());
		System.out.println("p2: "+p2.getAge()+", Address2: "+p2.getAddress().getCity());
		System.out.println(p1 == p2);
		
		address.setCity("深圳市 南山区");
		System.out.println("p1: "+p1.getAge()+", Address1: "+p1.getAddress().getCity());
		System.out.println("p2: "+p2.getAge()+", Address2: "+p2.getAddress().getCity());
		// 两个地址都改变了，浅复制只是复制了addr变量的引用，并没有真正的开辟另一块空间，将值复制后再将引用返回给新对象。
		// 只用p1改变，符合深度复制
		
	}

}

class Person implements Cloneable {
	private int age;
	private Address address;
	
	@Override
	public Person clone() {
		Person person = new Person();
		try {
			person = (Person) super.clone(); // 浅复制
		// Person不实现Cloneable接口，调用clone()方法会抛出CloneNotSupportedException异常
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		person.address = address.clone(); // 深复制
		return person;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}

class Address implements Cloneable {
	private String city;
	
	@Override
	public Address clone() {
		Address address = new Address();
		try {
			address = (Address) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}



