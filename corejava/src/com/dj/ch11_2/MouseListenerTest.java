package com.dj.ch11_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerTest extends JFrame{
	private JLabel northLbl;
	private JLabel centerLbl;
	public MouseListenerTest(String title){
		setTitle(title);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		setVisible(true);
	}
	private void init(){
		northLbl = new JLabel("status:");	
		centerLbl = new JLabel("");
		centerLbl.setBackground(Color.YELLOW);
		//设置不显示标签下面组件的颜色(这样就可以显示自己的颜色了)
		centerLbl.setOpaque(true);
		add(northLbl,BorderLayout.NORTH);
		add(centerLbl,BorderLayout.CENTER);
		process();
	}
	//专门给组件添加事件监听的方法
	private void process(){
		//给centerLbl 添加指定的鼠标侦听器，接收此组件发出的鼠标事件。
		centerLbl.addMouseListener(new MouseListener(){
			//鼠标按键在组件上单击（按下并释放）时调用。 
			public void mouseClicked(MouseEvent e){}	
			//鼠标进入到组件上时调用。
			public void mouseEntered(MouseEvent e){}
			//鼠标离开组件时调用。
			public void mouseExited(MouseEvent e){}
			//鼠标按键在组件上按下时调用
			public void mousePressed(MouseEvent e){
				String info = "status:press,x=" + e.getX() + ",y=" + e.getY();
				northLbl.setText(info);
			}
			//鼠标按钮在组件上释放时调用。
			public void mouseReleased(MouseEvent e){}
		});
		
		//给centerLbl 添加指定的鼠标移动侦听器，接收此组件发出的鼠标移动事件。
		centerLbl.addMouseMotionListener(new MouseMotionAdapter(){
			//e表示鼠标移动这个事件对象
			public void mouseMoved(MouseEvent e){
				//e.getX() e.getY() 通过事件对象获得鼠标当前的坐标
				String info = "status:move,x=" + e.getX() + ",y=" + e.getY();
				//把字符串设置到northLbl中
				northLbl.setText(info);
			}
			
		});
	}
	public static void main(String[] args){
		MouseListenerTest mlt = new MouseListenerTest("MultiListener Test");
	}
}
