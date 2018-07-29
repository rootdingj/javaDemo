package com.dj.ch12_1;

public class ThreadTest extends Thread{
	
	/*public void run() {
		Thread currentThread = Thread.currentThread();
		for(int i=0;i<10;i++){
			System.out.println("线程名: "+currentThread.getName());
			System.out.println(i);
			if(i==5){
				try {
					Thread.sleep(2000);  //谁执行谁休眠
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}		
		}
	}*/
	public static void main(String[] args) {
		Thread t = new ThreadTest();
//		System.out.println("main:"+t.getName());
//		System.out.println("main:"+t.getId());
//		t.run();    //主线程main调用ThreadTest类中的run方法
		t.start();  //线程类启动线程，类似定时器，
	}
}
