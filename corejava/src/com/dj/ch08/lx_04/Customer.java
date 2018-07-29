package com.dj.ch08.lx_04;

import java.util.ArrayList;

//¹Ë¿Í
public class Customer {
	public Account getAccount(int index) {
		return (Account) account.get(index-1);
	}
	public String getName() {
		return name;
	}
	private ArrayList account = new ArrayList();
	private String name;
	public Customer(String name){
		this.name = name;
	}
	public ArrayList getAllAcount(){
		return account;
		
	}
	public void addAcount(Account acount){
		account.add(acount);
	}
}
