package com.comviva;

public class AccountClient {
	public static void main(String[] args) {
		Account account;
		account = new Account();
		 
		Name name = new Name();
		name.setfName("Pratham");
		name.setlName("Kumar");
		
		
		account.setAccountNo(101);
		account.setName(name);
		account.setIncome(-2000);
		
		System.out.println(account); // acoount.toString() overridden in Name and Account class
		
		Account acc[] = new Account[4]; //array of 4 accounts
		acc[0] = new Account();
		acc[0].setAccountNo(102);
		acc[0].setIncome(44545);
		acc[0].setName(name);
		
		System.out.println(acc[0]);
	}
}
