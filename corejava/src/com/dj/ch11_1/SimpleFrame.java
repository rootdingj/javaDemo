package com.dj.ch11_1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleFrame {
	public static void main(String[] args) {
		//创建一个容器
		Frame f = new Frame("hello");
		
		//给窗口添加一个点击关闭的事件(就是点击关闭的时候执行什么方法去做什么事情)
		//如果不添加的话,那么窗口就无法被关闭,只能用系统命令来杀死这个进程(kill命令)
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//向容器中添加一个按钮
		f.add(new Button("Press Me"));
		//设置容器的大小
		f.setSize(100,100);
		//最后设置容器可见
		f.setVisible(true);
	}
}
