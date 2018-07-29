package com.dj.ch08.lx_04;

public class TestBanking {
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.addCustomer(new Customer("dj1"));
		
		bank.addCustomer(new Customer("dj2"));
		
		Customer cu1 = bank.getCustomer(1);
		Customer cu2 = bank.getCustomer(2);
		System.out.println(cu1);
		cu1.addAcount(new CheckingAccount(6000.0, 6000.0));
//		cu1.addAcount(new SavingAccount(6000.0,500.0));
		
	/*	Account ac1 = cu1.getAccount(1);
		System.out.println(cu1.getName()+" account1的利息是"+ac1.getBalance());
		ac1.deposit(1000.0);
		System.out.println(cu1.getName()+"account1 的利息是"+ac1.getBalance());
		ac1.withdraw(8000.0);
		System.out.println(cu1.getName()+"account1 的利息是"+ac1.getBalance());*/
		
	}
}
