package com.dj.ch12.lx;

public class Printer extends Thread{

	private Storage data;
	public Printer(Storage data) {

		this.data = data;
	}
	
	public void run() {
		while(true){
			synchronized (data) {
				if(data.falg){
					int a = data.getA();
					System.out.println(a);
					data.falg = false;
					if(a==99)break;
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
