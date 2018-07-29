package com.dj.ch12.lx;

public class Counter extends Thread{
	
	private Storage data;
	public Counter(Storage data) {
		this.data = data;
	}
	
	public void run() {
		int a = 0;
		while(a<100){
			synchronized (data) {
			if(!data.falg){
				data.setA(a++);
				data.falg = true;
				data.notifyAll();
			}else{
				try {
					Thread.sleep(200);
					data.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		  }
		}
	}
}
