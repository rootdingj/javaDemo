package com.dj.ch11_1;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class PasswordFieldTest extends JFrame{
	private Container container;
	private JPasswordField field;
	
	public PasswordFieldTest() {
		container = getContentPane();
		setTitle("this is PasswordFieldTest");
		setLocation(50,50);
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
		setVisible(true);
	}
	
	private void init(){
		//创建秘密框对象
		field = new JPasswordField();
		//设置显示的字符为*
		field.setEchoChar('*');
		container.add(field,BorderLayout.NORTH);
	}
	
	public static void main(String[] args) {
		new PasswordFieldTest();
	}
	
	
}

