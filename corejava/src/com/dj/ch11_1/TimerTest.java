package com.dj.ch11_1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class TimerTest {
	//容器  (相当于一个桌子)
	private JFrame frame;
	//附属容器  (相当于桌子上的桌布)
	private Container container;
	//嵌套的容器 放到container北边
	private JPanel north;
	private JLabel lable1;
	private Timer timer;
	
	public TimerTest() {
		//设置窗口的标题
		frame = new JFrame("TimerTest");
		//获得容器中的附属容器
		container = frame.getContentPane();
		//设置frame的位置
		frame.setLocation(100, 100);
		//设置frame的大小
		frame.setSize(400, 400);
		//设置点击关闭后退出这个java程序
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//调用init方法初始化container中的组件
		init();
		//设置frame可见
		frame.setVisible(true);
	}
	private void init(){
		//初始化界面中的组件
		lable1 = new JLabel("10");
		
		timer = new Timer(1000,new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//拿到标签中的值
				String text = lable1.getText();
				//转换为数字
				int x = Integer.parseInt(text);
				//先把数字减1然后再设置到标签中显示
				lable1.setText(--x+"");
				//如果标签中的值为是0 则关闭定时器
				if(x==0){
					timer.stop();
				}
			}
		});
		north = new JPanel();
		//设置容器的布局管理器并把组件添加到对应的位置
		container.add(north,BorderLayout.NORTH);
		north.setLayout(new FlowLayout());
		north.add(lable1);
		
		//开启定时器
		timer.start();
	}
	
	public static void main(String[] args) {
		
		new TimerTest();
		
	}
}
