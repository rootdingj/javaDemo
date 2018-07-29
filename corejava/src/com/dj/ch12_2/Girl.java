package com.dj.ch12_2;

/**女孩,负责花钱*/
public class Girl extends Thread{
	private Account account;
	public Girl(Account account, String name) {
		this.account = account;
		setName(name);
	}
	public void run() {
		while(true){
			int money = (int)(Math.random()*10000+1);
			account.wit(money);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

