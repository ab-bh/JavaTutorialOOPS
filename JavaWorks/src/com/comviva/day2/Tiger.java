package com.comviva.day2;

public class Tiger implements IAnimal{

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("GRRRRRRRR... ");
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Tiger walks with 2 legs and 2 limbs... ");
		
	}

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("GRRRRRRRRR... ");
		
	}
	
	public void killAndEat(){
		System.out.println("Tiger kills and eats...");
	}

}
