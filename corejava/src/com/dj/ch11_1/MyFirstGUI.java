package com.dj.ch11_1;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFirstGUI {
	//顶级容器
	private JFrame frame;
	//次级容器
	private Container container;
	//按钮
	private JButton button;
	//Lable标签,可写多个
	private JLabel addLablel,eqsLabel;
	//文本输入框
	private JTextField f1,f2,f3;
	
	
	public MyFirstGUI(){
		//初始化容器(相当于桌子)
		frame = new JFrame();
		//获得次级容器对象(相当于桌布)
		container = frame.getContentPane();
		//参数1、2是设置frame的位置，电脑屏幕左上角为(0,0)坐标
		//参数3、4是frame显示的大小(长宽)
		frame.setBounds(40,40, 400, 400);
		//点击界面右上角红叉可以关闭程序
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//相当于设置界面的标题在界面的上边界里面
		frame.setTitle("this id my first GUI");
		init();
		//设置界面可以显示，默认容器初始化完成之后是隐藏的
		frame.setVisible(true);
		
	}
	
		//初始化组件
		private void init(){
			
			button = new JButton("add");
			addLablel = new JLabel("+");
			eqsLabel = new JLabel("=");
			//创建文本输入框对象，并设置长度为5
			f1 = new JTextField(5);
			f2 = new JTextField(5);
			f3 = new JTextField(5);
			
			//设置容器的布局管理器
			container.setLayout(new FlowLayout());
			
			container.add(f1);
			container.add(addLablel);
			container.add(f2);
			container.add(eqsLabel);
			container.add(f3);
			container.add(button);
			
			//给指定的组件添加事件监听,匿名内部类
			button.addActionListener(new ActionListener() {
				//当鼠标点击这个指定按钮的时候，程序就会调用这个方法
				@Override
				public void actionPerformed(ActionEvent e) {
					//拿到第一个输入框中的数组(String转换为Double)
					double a = Double.parseDouble(f1.getText());
					
					//拿到第二个输入框中的数组(String 转换为Double)
					double b = Double.parseDouble(f2.getText());
					
					//相加得到结果,并放到第三个输入框中
					double c = a+b;
					f3.setText(c+""); //转成字符串行
				}
			});
			
		}
	
	public static void main(String[] args) {
		
		new MyFirstGUI();
	}
}
