package com.comviva;

public class Account {

	private int accountNo;
	private double income;
	private Name name;

	
	// if you dont have a method with classname 
	// which doesn't take parameter then the compiler shall give
	// this is called constructor
	// Account();
	
	Account(){
		super();
	}
	
	//methods or behaviour in OOP's
	
	void display(){
		System.out.println("Account No: "+ this.accountNo);
		System.out.println("First Name: "+ this.getName().getfName());
		System.out.println("Last Name: "+ this.getName().getlName());
		System.out.println("Customer Income: "+ this.income);
	}

	@Override
	public String toString() {
		return this.accountNo+", "+this.name+", "+ this.income;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	
	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		if(income < 5000){
			System.out.println("Sorry the income cannot be so less!!");
			this.income = 5000;
		}
		else{
			this.income = income;
		}
	}
}
