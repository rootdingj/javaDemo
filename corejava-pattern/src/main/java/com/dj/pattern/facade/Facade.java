package com.dj.pattern.facade;

// 外观角色
public class Facade {

	private SubSystemA subA = new SubSystemA();
	private SubSystemB subB = new SubSystemB();
	private SubSystemC subC = new SubSystemC();

	public void wrapOpration() {
		subA.oprationA();
		subB.oprationB();
		subC.oprationC();
	}
}
