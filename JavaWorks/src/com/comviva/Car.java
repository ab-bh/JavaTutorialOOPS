package com.comviva;

public class Car extends FourWheeler {
	private int fuelCapacity;
	private int numberOfSeats;
	private int numberOfDoors;
	// parametric constructor
	Car(int fuelCapacity, int numberOfSeats, int numberOfDoors ){
		this.fuelCapacity = fuelCapacity;
		this.numberOfSeats = numberOfSeats;
		this.numberOfDoors = numberOfDoors;
		System.out.println("Car is creating...");
	}
	public int getFuelCapacity(){
		return fuelCapacity;
	}
	@Override
	void numberOfDoors() {
		// TODO Auto-generated method stub
		System.out.println("Car has " + numberOfDoors + " doors");
		
	}
	@Override
	void numberOfSeats() {
		// TODO Auto-generated method stub
		System.out.println("Car has " + numberOfSeats + " seats");
		
	}
}
