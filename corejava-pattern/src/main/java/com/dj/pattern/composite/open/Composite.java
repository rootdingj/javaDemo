package com.dj.pattern.composite.open;

import java.util.ArrayList;
import java.util.List;

// 分支节点
public class Composite implements Component {

	private List<Component> children = new ArrayList<Component>(16);

	@Override
	public void add(Component com) {
		children.add(com);
	}

	@Override
	public void remove(Component com) {
		children.remove(com);
	}

	@Override
	public Component getChild(int i) {
		return children.get(i);
	}

	@Override
	public void operation() {
		for (Component c : children) {
			c.operation();
		}
	}

}
