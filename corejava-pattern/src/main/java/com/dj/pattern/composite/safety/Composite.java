package com.dj.pattern.composite.safety;

import java.util.ArrayList;
import java.util.List;

// 分支节点
public class Composite implements Component {

	private List<Component> children = new ArrayList<Component>(16);

	public void add(Component com) {
		children.add(com);
	}

	public void remove(Component com) {
		children.remove(com);
	}

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
