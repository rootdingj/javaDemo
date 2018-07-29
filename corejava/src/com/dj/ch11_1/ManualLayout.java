package com.dj.ch11_1;

import java.awt.Button;
import java.awt.Frame;

public class ManualLayout {
	public static void main(String[] args) {
		//创建一个容器对象
		Frame f = new Frame("this id my first frame");
		//取消布局管理器 ，Frame默认是BorderLayout
		f.setLayout(null);
		//宽、高
		f.setSize(400,400);
		//创建一个按钮对象
		Button b = new Button("press me");
		b.setSize(80,30);
		//设置按钮在容器中的位置，相对左上角（0,0）的坐标
		b.setLocation(40,60);
		//把按钮放到容器中
		f.add(b);
		//设置容器可见
		f.setVisible(true);
		
		
		
		
		
		
		
	}
}
