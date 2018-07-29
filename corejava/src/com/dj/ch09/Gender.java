package com.dj.ch09;

//把枚举类型看成一个特殊的类来处理

public enum Gender implements So{
	B("男") {
		@Override
		public void go() {
			// TODO Auto-generated method stub
		}
	}
	,G ("女"){
		@Override
		public void go() {
			// TODO Auto-generated method stub
		}
	};
//------固定区和正常区--------------------
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	private  Gender() {
		//打印两次，有几个元素就几次
		System.out.println("无参构造函数");
		// TODO Auto-generated constructor stub
	}
	private Gender(String name){
		this.name = name;
	}
	@Override
	public void test() {
		
	}
	public abstract void go();
}

interface So{
	void test();
}
