package com.comviva;

public class Maruti extends Car{
	boolean isAbs;
	private String model;
	Maruti(int fuelCapacity, boolean isAbs, int numberOfSeats, int numberOfDoors, String model){
		super(fuelCapacity, numberOfSeats, numberOfDoors); // has to be the first line of the constructor
		System.out.println("Car Maruti is creating...");
		this.isAbs = isAbs;
		this.model = model;
	}
	
	public boolean isAbs() {
		return isAbs;
	}
	
	public void carWheels(){
		System.out.println("Maruti Radial Wheels");
	}

	public void modelName(){
		System.out.println("car model is " + model);
	}
}
