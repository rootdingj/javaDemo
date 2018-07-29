package com.dj.ch12_2;

public class AccountTest {
	
	public static void main(String[] args) {
		Account account = new Account(5000);
		Boy boy = new Boy(account, "tom");
		Girl lily1 = new Girl(account, "lily1");
		Girl lily2 = new Girl(account, "lily2");
		Girl lily3 = new Girl(account, "lily3");
		boy.start();
		lily1.start();
		lily2.start();
		lily3.start();
	}
}