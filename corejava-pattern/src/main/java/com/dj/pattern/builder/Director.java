package com.dj.pattern.builder;

// 指挥者：调用建造者中的方法完成复杂对象的创建。
public class Director {

	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	// 产品构建与组装的方法
	public Product buildProduct() {
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC();
		return builder.getResult();
	}

}
