package com.dj.ch11_2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

//这个类继承了JFreme类,就可以直接调用JFrame中的方法
public class ProgressBarTest extends JFrame{
	private Container container;
	//一个标签对象 可以放文字
	private JLabel label;
	//进度条
	private JProgressBar bar;
	//显示为下载的按钮
	private JButton button;
	//定时器,每隔一段时间可以帮我们做一件事情
	//直到你主动调用方法让定时器停下来为止
	private Timer timer;
	
	public ProgressBarTest(){
		container = getContentPane();
		setBounds(40,40,200,30);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
		setVisible(true);
		//自动调整组件合适的大小和位置
		pack();
	}
	
	private void init(){
		label = new JLabel("点击按钮下载");
		button = new JButton("下载");
		bar = new JProgressBar();
		//设置进度条中的值初始为0
		bar.setValue(0);
		//最小值为0
		bar.setMinimum(0);
		//最大值为100
		bar.setMaximum(100);
		//显示当前进度条的状态
		bar.setStringPainted(true);
		
		//向container中添加组件
		container.add(button,BorderLayout.NORTH);
		container.add(bar);
		container.add(label,BorderLayout.SOUTH);
		
		//创建定时器对象,并指定定时器每1秒做什么事情
		timer = new Timer(1000,new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//获得进度条中当前的值
				int value = bar.getValue();
				
				//判断进度条中当前的值是否小于100
				if(value<100){
					//value加10
					value+=10;
					//再设置到进度条中
					bar.setValue(value);
				}else {
					//定时器停止运行
					timer.stop();
					//按钮位置为可用
					button.setEnabled(true);
				}
			}
		});
		
		//给按钮添加事件监听:点击按钮的时候做什么事情
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//定时器开启
				timer.start();
				//让按钮不能使用
				button.setEnabled(false);
				//把进度条中当前的值重新设置为0
				bar.setValue(0);
			}
		});
		
		//给进度条添加一个监听器 :进度条每次状态改变时候做什么时候
		bar.addChangeListener(new ChangeListener() {
			
			public void stateChanged(ChangeEvent e) {
				//获得进度条中的值
				int value = bar.getValue();
				//把这个值设置到label中
				label.setText("下载中"+value+"%");
			}
		});
		
	}
	public static void main(String[] args) {
		new ProgressBarTest();
	}
	
}
