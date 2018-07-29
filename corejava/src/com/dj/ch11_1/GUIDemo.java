package com.dj.ch11_1;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GUIDemo {
	//主容器  (相当于一个桌子)
	private JFrame frame;
	//附属容器  (相当于桌子上的桌布)
	private Container container;
	//嵌套的容器 
	private JPanel panel;
	//界面中需要用到的各种组件
	private JLabel lable1;
	private JButton but;
	private Timer timer;	//时间间隔
	
	public GUIDemo() {
		//这里进行窗口的常规属性设置
		//设置窗口的标题
		frame = new JFrame("TimerTest");
		//获得容器中的附属容器
		container = frame.getContentPane();
		//设置frame的位置
		frame.setLocation(100, 100);
		//设置frame的大小
		frame.setSize(400, 400);
		//设置点击关闭后退出这个java程序
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//调用init方法初始化container中的组件
		init();
		//设置frame可见
		frame.setVisible(true);
	}
	private void init(){
		//这里给放到容器中的各种组件进行初始化
		//....
		
		//设置容器或者嵌套如果的布局管理器
		//....
		
		//把各组组件添加到对应容器中的指定位置
		//....
		
		//给界面中需要事件的组件添加事件监听处理 
		//这样用户在界面中点击或者输入或者选择组件就有对应的代码处功能了
		//...
	}
	
	public static void main(String[] args) {
		
		new GUIDemo();
		
	}
}
