package com.dj.pattern.builder;

// 具体建造者：实现 Builder 接口，完成复杂产品的各个部件的具体创建方法。
public class ConcreteBuilder extends Builder {

	@Override
	public void buildPartA() {
		 product.setPartA("buildPartA");
	}

	@Override
	public void buildPartB() {
		product.setPartA("buildPartB");
	}

	@Override
	public void buildPartC() {
		product.setPartA("buildPartC");
	}

}
