package com.dj.ch11.lx_01;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AWTFrame1 {
	private JFrame frame;
	private Container container;
	private JButton button1,button2;
	private JLabel label;
	private JPanel panel;
		
	public AWTFrame1(){
		frame = new JFrame("第一题");
		container = frame.getContentPane();
		frame.setLocation(100, 100);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		frame.setVisible(true);
	}
	
	private void init(){
		label = new JLabel("一个标签");
		Font font = new Font("SansSerif",Font.PLAIN,25);
		label.setFont(font);
		
		panel = new JPanel();
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		panel.add(button1);
		panel.add(button2);
		
		container.add(label);
		container.add(panel,BorderLayout.SOUTH);
		
	}
	public static void main(String[] args) {
		new AWTFrame1();
	}
}
