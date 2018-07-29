package com.dj.ch12_1;

public class InterruptTest extends Thread{
	
	public void run() {
		String name = getName();
		for(int i=0;i<10;i++){
			System.out.println(i+":threadName:"+name);
			if(i==5){
				try {
					Thread.sleep(1000*10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) throws Exception {
		InterruptTest ow = new InterruptTest();
		ow.start();
		Thread.sleep(10);
		System.out.println(ow.interrupted());
		System.out.println(".....1");
//		ow.interrupt();
//		ow.interrupt();
		
		
	}
}
