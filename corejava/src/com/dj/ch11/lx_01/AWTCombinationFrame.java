package com.dj.ch11.lx_01;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AWTCombinationFrame extends JFrame{
	private Container container;
	private JButton[] buts;
	private JLabel label;
	
	
	public AWTCombinationFrame(String title){
		container = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(title);
		container.setLayout(new BorderLayout());
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(4, 3,4,5));
		buts = new JButton[12];
		for(int i=0;i<9;i++){
			buts[i] = new JButton(Integer.toString(i+1));
			container.add(buts[i]);
		}
		buts[9] = new JButton("*");
		buts[10] = new JButton("0");
		buts[11] = new JButton("#");
		centerPanel.add(buts[9]);
		centerPanel.add(buts[10]);
		centerPanel.add(buts[11]);
		container.add(centerPanel, BorderLayout.CENTER);
		label = new JLabel("Ready");
		container.add(label, BorderLayout.NORTH);
		setSize(150, 230);
		setVisible(true);
	
	}
	public static void main(String[] args) {
		new AWTCombinationFrame("µÚ¶þÌâ");
	}
	
	
}
