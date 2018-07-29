package com.dj.ch11_1;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//网格布局管理器
public class GridLayoutTest {
	private JFrame frame;
	private Container container;
	private JButton[] buts;
	
	public GridLayoutTest(){
		
		frame = new JFrame("this is GridLayoutTest");
		container = frame.getContentPane();
		frame.setLocation(100,100);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		frame.setVisible(true);
		
	}
	
	private void init(){
		
		buts = new JButton[9];
		
		//GridLayout(3,3)表示布局为3行3列
		frame.setLayout(new GridLayout(3, 3));
		
		for(int i=0;i<buts.length;i++){
			buts[i] = new JButton((i+1)+"");
			container.add(buts[i]);
		}
	}
	public static void main(String[] args) {
		new GridLayoutTest();
	}
}
