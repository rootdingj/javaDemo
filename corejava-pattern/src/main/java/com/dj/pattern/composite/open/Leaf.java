package com.dj.pattern.composite.open;

public class Leaf implements Component {
	
	private String name;

	public Leaf(String name) {
		this.name = name;
	}

	@Override
	public void add(Component com) {}

	@Override
	public void remove(Component com) {}

	@Override
	public Component getChild(int i) {
		return null;
	}

	@Override
	public void operation() {
		 System.out.println("叶子节点 "+name+" 被访问。。。"); 
	}

}
