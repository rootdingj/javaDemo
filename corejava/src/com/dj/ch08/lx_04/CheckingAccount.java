package com.dj.ch08.lx_04;

public class CheckingAccount extends Account{
	private double overdaft;
	
	public double getOverdaft() {
		return overdaft;
	}
	public CheckingAccount(double banlance) {
		super(banlance);
		this.balance = balance;
	}
	public CheckingAccount(double banlance,double overdaft) {
		super(banlance);
		this.balance = banlance;
		this.overdaft = overdaft;
	}
	public boolean withdraw(double amount){
		return false;
	}

	
}
