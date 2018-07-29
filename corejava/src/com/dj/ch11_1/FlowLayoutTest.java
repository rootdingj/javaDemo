package com.dj.ch11_1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//流式布局管理器
public class FlowLayoutTest {
	
	private JFrame frame;
	private Container container;
	
	//定义一个JButton类型的数组
	private JButton[] buts;
	//定义一个次级容器panel，可以嵌套调用
	private JPanel panel;
	
	public FlowLayoutTest(){
		
		frame = new JFrame("FlowLayout");
		container = frame.getContentPane();
		frame.setLocation(100, 100);
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		frame.setVisible(true);
		
	}
		private void init(){
			//初始化panel
			panel = new JPanel();
			
			//设置container的布局管理器为BorderLayout
			container.setLayout(new BorderLayout());
			
			container.add(panel);
			
			//给panel设置一个布局管理器FlowLayout
			//其实panel默认的布局管理器也是FlowLayout
			panel.setLayout(new FlowLayout());
			
			buts = new JButton[50];
			//循环产生50个按钮并且放在panel中
			for(int i=1;i<=buts.length;i++){
				if(i<10){
					buts[i-1] = new JButton("0"+i);  //规范显示
				}else if(i<=50){
					buts[i-1] = new JButton(""+i);
				}
				panel.add(buts[i-1]);  //把按钮放到桌布上
			}
			
		}
		public static void main(String[] args) {
			new FlowLayoutTest();
		}
	
	
}
