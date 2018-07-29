package com.dj.ch11_1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageIconTest {
	//容器  (相当于一个桌子)
	private JFrame frame;
	//附属容器  (相当于桌子上的桌布)
	private Container container;
	//嵌套的容器 放到container北边
	private JPanel north;
	private JLabel lable1;
	private JButton but;
	
	public ImageIconTest() {
		//设置窗口的标题
		frame = new JFrame("ImageIconTest");
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
		lable1 = new JLabel(new ImageIcon("src/com/dj/ch11_1/mouse.jpg"));
		but = new JButton();
		but.setIcon(new ImageIcon("src/com/dj/ch11_1/mouse.jpg"));
		north = new JPanel();
		container.add(north,BorderLayout.NORTH);
		container.add(but);
		north.setLayout(new FlowLayout());
		north.add(lable1);
	}
	
	public static void main(String[] args) {
		
		new ImageIconTest();
		
	}
}
