package com.dj.ch11_2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxTest extends JFrame implements ActionListener{
	private Container container;
	private JLabel jLabel;
	private JComboBox box;
	
	public ComboBoxTest() {
		container = getContentPane();
		setBounds(40,40,300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
		setVisible(true);
	}
	
	private void init(){
		jLabel = new JLabel("hello world briup");
		box = new JComboBox();
		box.addItem("Dialog");
		box.addItem("DialogInput");
		box.addItem("Monospaced");
		box.addItem("Serif");
		box.addItem("SansSerif");
		
		container.add(jLabel);
		container.add(box,BorderLayout.SOUTH);
		
		box.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e) {
		JComboBox jcb = (JComboBox)e.getSource();
		String s = (String)jcb.getSelectedItem();
		Font font = new Font(s,Font.PLAIN,25);
		jLabel.setFont(font);
	}
	
	public static void main(String[] args) {
		ComboBoxTest c = new ComboBoxTest();
	}
	
}

