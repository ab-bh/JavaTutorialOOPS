package com.comviva;

public class Monster extends TempoTraveller{
	boolean isAbs;
	private String model;
	Monster(int fuelCapacity, boolean isAbs, int numberOfSeats, int numberOfDoors, String model){
		super(fuelCapacity, numberOfSeats, numberOfDoors); // has to be the first line of the constructor
		System.out.println("tempo Monster is creating...");
		this.isAbs = isAbs;
		this.model = model;
	}
	
	public boolean isAbs() {
		return isAbs;
	}
	
	public void carWheels(){
		System.out.println("Monster has some Wheels");
	}

	public void modelName(){
		System.out.println("tempo model is " + model);
	}
}
