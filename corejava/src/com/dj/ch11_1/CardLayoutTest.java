package com.dj.ch11_1;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

//卡片布局管理器
public class CardLayoutTest {
	private JFrame frame;
	private Container container;
	private JPanel panel;
	private JPanel[] jPanels;
	
	public CardLayoutTest() {
		frame = new JFrame();
		container = frame.getContentPane();
		frame.setLocation(50,50);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		frame.setVisible(true);
	}
	private void init(){
		panel = new JPanel();
		
		container.add(panel);
		
		jPanels = new JPanel[4];
		
		jPanels[0] = new JPanel();
		jPanels[0].setBackground(Color.red);
		
		jPanels[1] = new JPanel();
		jPanels[1].setBackground(Color.blue);
		
		jPanels[2] = new JPanel();
		jPanels[2].setBackground(Color.black);
		
		jPanels[3] = new JPanel();
		jPanels[3].setBackground(Color.gray);
		
		panel.setLayout(new CardLayout());
		
		//向CardLayout布局管理器中放置组件的时候一定要给组件起一个名字
		panel.add("0",jPanels[0]);
		panel.add("1",jPanels[1]);
		panel.add("2",jPanels[2]);
		panel.add("3",jPanels[3]);
		
		//添加监听器 可以让鼠标点击之后有反应
		addLister(panel);
		
	}
	//addLister这个方法是为了给panel添加一个鼠标点击事件
	private void addLister(JPanel panel2) {
		
		/*new一个类对象来代替接口的实现类，就可以不用重写接口中的所有的方法
		 * 只要写自己想要的方法就好了
		 * */
//		panel.addMouseListener(new MouseListener() {};
		panel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//获得panel容器上面的布局管理器 
				//并转为CardLayout类型的对象
				CardLayout cl = (CardLayout) panel.getLayout();
				
				//显示CardLayout管理器中的下一个组件
				//这个参数表示:在哪一个容器中设置的这个CardLayout管理器
				cl.next(panel);
//				cl.show(panel, "3");
			}
		
		});
		
		
	}

	public static void main(String[] args) {
		
		new CardLayoutTest();
	}

}