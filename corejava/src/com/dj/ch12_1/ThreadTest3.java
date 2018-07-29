package com.dj.ch12_1;

public class ThreadTest3 extends Thread{
	
	public void run() {
		Thread currentThread = Thread.currentThread();
		for(int i=0;i<10;i++){
			System.out.println(i+":threadName:"+currentThread.getName());
			try {
				Thread.sleep(1000);
				if(i==5){
					System.out.println("i="+i);
					currentThread.interrupt();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Thread t = new ThreadTest3();
		t.start();
	/*	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t.interrupt();*/
	}
}

