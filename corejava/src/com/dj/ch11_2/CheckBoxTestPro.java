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

public class CheckBoxTestPro extends JFrame implements ActionListener{
	private Container container;
	private JLabel label;
	private JCheckBox box1,box2;
	private JPanel panel;
	private boolean box1_flag;
	
	public CheckBoxTestPro() {
		container = getContentPane();
		setBounds(40,40,300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
		setVisible(true);
	}
	
	private void init(){
		label = new JLabel("briup hello world");
		Font font = new Font("SansSerif",Font.PLAIN,25);
		label.setFont(font);
		
		panel = new JPanel();
		box1 = new JCheckBox("BOLD");
		box2 = new JCheckBox("ITALIC");
		
		panel.add(box1);
		panel.add(box2);
		
		container.add(label);
		container.add(panel,BorderLayout.SOUTH);
		
		//本来参数应该是一个ActionListener接口实现类对象
		//一般我们会写一个ActionListener接口的匿名内部类对象放在这
		//我们这里能写this的原因是:当前类CheckBoxTestPro实现了ActionListener
		//所以当前类CheckBoxTestPro就是ActionListener接口的一个实现类
		//this代表当前类CheckBoxTestPro的一个对象
		//所以我们在这里可以直接写this
		box1.addActionListener(this);
		box2.addActionListener(this);
		
		/*box1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		box2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});*/
		
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		System.out.println(e);
		Object o = e.getSource();
		if(box1==o){
			if(!box1_flag){
				Font font = new Font("SansSerif",Font.BOLD,25);
				label.setFont(font);
				box1_flag = true;
			}else{
				Font font = new Font("SansSerif",Font.PLAIN,25);
				label.setFont(font);
				box1_flag = false;
			}
		}
		if(box2==o){
			Font font = new Font("SansSerif",Font.ITALIC,25);
			label.setFont(font);
		}
		
	}
	
	public static void main(String[] args) {
		new CheckBoxTestPro();
	}
	
}
