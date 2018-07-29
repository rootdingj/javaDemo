package com.dj.ch08.lx_04;

//账户
public class Account {
	protected double balance;  //余额
	public double getBalance() {
		return balance;
	}
	public Account(double banlance){
		this.balance = balance;
	}
	//存款
	public boolean deposit(double amount){
		return false;
	}
	//收回
	public boolean withdraw(double amount){
		return false;
	}
}
