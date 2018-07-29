package com.dj.ch12_2;

/**ÄÐº¢,¸ºÔðÕõÇ®*/
public class Boy extends Thread{
	private Account account;
	public Boy(Account account, String name) {
		this.account = account;
		setName(name);
	}
	public void run() {
		while(true){
			int money = (int)(Math.random()*10000+1);
			account.pos(money);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}