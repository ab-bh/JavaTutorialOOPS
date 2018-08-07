package com.comviva;

public class SwarajMazda extends TempoTraveller{
	boolean isAbs;
	private String model;
	SwarajMazda(int fuelCapacity, boolean isAbs, int numberOfSeats, int numberOfDoors, String model){
		super(fuelCapacity, numberOfSeats, numberOfDoors); // has to be the first line of the constructor
		System.out.println("tempo SwarajMazda is creating...");
		this.isAbs = isAbs;
		this.model = model;
	}
	
	public boolean isAbs() {
		return isAbs;
	}
	
	public void carWheels(){
		System.out.println("Mazda has some Wheels");
	}

	public void modelName(){
		System.out.println("tempo model is " + model);
	}
}
