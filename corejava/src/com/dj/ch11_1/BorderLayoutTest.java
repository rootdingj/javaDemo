package com.dj.ch11_1;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

//边界布局管理器
public class BorderLayoutTest {
	//容器窗口
	private JFrame frame;
	//附属容器
	private Container container;
	
	private JButton north,south,west,east,center;
	
	public BorderLayoutTest(){
		//设置窗口的标题
		frame = new JFrame("BorderLayout");
		//获得容器中的附属容器
		container = frame.getContentPane();
		//设置frame的位置
		frame.setLocation(100,100);
		//设置frame的大小
		frame.setSize(400, 400);
		//设置点击关闭后退出这个程序
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//调用init方法初始化container中的组件
		init();
		frame.setVisible(true);
		
	}
		private void init(){
			//初始化五个按钮
			north = new JButton("north");
			south = new JButton("south");
			west = new JButton("west");
			east = new JButton("east");
			center = new JButton("center");
			
			//设置container的布局管理器为BorderLayout
			//其实默认布局管理器也是这个
			container.setLayout(new BorderLayout());
			
			//把按钮添加到container中，并指明添加到的位置
			container.add(north,BorderLayout.NORTH);
			container.add(south,BorderLayout.SOUTH);
			container.add(west,BorderLayout.WEST);
			container.add(east,BorderLayout.EAST);
			
			//container.add(center)这样写和下面的效果是一样的
			//如果你不指定放到BorderLayout那个位置的时候
			//他会默认的把组件放到中间那个位置
			container.add(center,BorderLayout.CENTER);
			
		}
		public static void main(String[] args) {
			new BorderLayoutTest();
		}
}
