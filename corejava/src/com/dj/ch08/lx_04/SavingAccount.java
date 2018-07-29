package com.dj.ch08.lx_04;

public class SavingAccount extends Account{
	
	private double rate;
	public SavingAccount(double banlance,double rate) {
		super(banlance);
		this.balance = banlance;
		this.rate = rate;
	}

}
