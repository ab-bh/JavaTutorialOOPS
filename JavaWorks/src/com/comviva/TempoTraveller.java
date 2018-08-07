package com.comviva;

public class TempoTraveller extends FourWheeler{
	private int fuelCapacity;
	private int numberOfSeats;
	private int numberOfDoors;
	// parametric constructor
	TempoTraveller(int fuelCapacity, int numberOfSeats, int numberOfDoors ){
		this.fuelCapacity = fuelCapacity;
		this.numberOfSeats = numberOfSeats;
		this.numberOfDoors = numberOfDoors;
		System.out.println("TempoTraveller is creating...");
	}
	public int getFuelCapacity(){
		return fuelCapacity;
	}
	@Override
	void numberOfDoors() {
		// TODO Auto-generated method stub
		System.out.println("tempotraveller has " + numberOfDoors + " doors");
		
	}
	@Override
	void numberOfSeats() {
		// TODO Auto-generated method stub
		System.out.println("tempotraveller has " + numberOfSeats + " seats");
		
	}
}
