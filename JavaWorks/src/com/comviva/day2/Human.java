package com.comviva.day2;

public class Human extends Eyes implements IAnimal{

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("Human talks with accent... ");
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Human walks with two legs... ");
		
	}

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("Human shouts... ");
	}
	
}
