package com.dj.ch11_1;

import java.awt.Color;

import javax.swing.JFrame;

public class JFrameTest{
	public static void main(String[] args){
		
		JFrame frame = new JFrame();
		frame.setTitle("First GUI program");
		//设置frame的大小
		frame.setSize(500,500);
		//设置frame的位置
		frame.setLocation(100,100);
		//设置frame大小不可变化
		frame.setResizable(false);
		//设置背景颜色
		frame.getContentPane().setBackground(Color.YELLOW);
		//设置点击退出事件
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置frame可见
		frame.setVisible(true);
	}
}
