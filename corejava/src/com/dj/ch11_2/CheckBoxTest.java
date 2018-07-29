package com.dj.ch11_2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxTest {
	private JFrame frame;
	private Container container;
	private JLabel label;
	private JCheckBox box1,box2;
	private JPanel panel;
	
	public CheckBoxTest() {
		frame = new JFrame("this is CheckBoxTest");
		container = frame.getContentPane();
		frame.setLocation(50, 50);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		frame.setVisible(true);
	}
	private void init(){
		label = new JLabel("briup hello world");
		//GUI中表示字体的类
		Font font = new Font("SansSerif",Font.PLAIN,25);
		label.setFont(font);
		panel = new JPanel();
		//字体的粗体
		box1 = new JCheckBox("BOLD");
		//字体的斜体
		box2 = new JCheckBox("ITALIC");
		//JFrame默认的是BorderLayout
		container.add(label);
		
		//JPnael默认的是FlowLayout
		panel.add(box1);
		panel.add(box2);
		
		container.add(panel,BorderLayout.SOUTH);
		
		box1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Font font = new Font("SansSerif",Font.BOLD, 25);
				label.setFont(font);
			}
		});
		
		box2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Font font = new Font("SansSerif",Font.ITALIC, 25);
				label.setFont(font);
			}
		});
		
		
	}
	public static void main(String[] args) {
		new CheckBoxTest();
	}
	
	
	
}
