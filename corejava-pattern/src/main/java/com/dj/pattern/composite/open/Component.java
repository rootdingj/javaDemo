package com.dj.pattern.composite.open;

// 抽象组件
public interface Component {

	void add(Component com);

	void remove(Component com);

	Component getChild(int i);

	void operation();

}
