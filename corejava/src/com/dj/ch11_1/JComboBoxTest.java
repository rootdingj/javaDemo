package com.dj.ch11_1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JComboBoxTest {
	
	//容器  (相当于一个桌子)
	private JFrame frame;
	//附属容器  (相当于桌子上的桌布)
	private Container container;
	//嵌套的容器 放到container北边
	private JPanel north;
	//下拉列表
	private JComboBox<String> box;
	
	public JComboBoxTest() {
		//设置窗口的标题
		frame = new JFrame("JComboBoxTest");
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
		//初始化界面中的组件
		box = new JComboBox<String>();
		//添加box的选项...
		box.addItem("菜单");
		box.addItem("查询");
		box.addItem("注册");
		box.addItem("登录");
		
		north = new JPanel();
		container.add(north,BorderLayout.NORTH);
		north.setLayout(new FlowLayout());
		north.add(box);
	}
	
	public static void main(String[] args) {
		
		new JComboBoxTest();
		
	}
}
