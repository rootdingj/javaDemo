package com.dj.pattern.builder;
// 产品角色: 由多个部件构成
public class Product {

	private String partA;
	private String partB;
	private String partC;

	public void setPartA(String partA) {
		this.partA = partA;
	}

	public void setPartB(String partB) {
		this.partB = partB;
	}

	public void setPartC(String partC) {
		this.partC = partC;
	}

	public void show() {
		System.out.println("显示产品特性。。。");
	}

}
