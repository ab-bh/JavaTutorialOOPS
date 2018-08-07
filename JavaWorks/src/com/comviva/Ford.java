package com.comviva;

public class Ford extends Car{	
	private String model;
	
	public Ford(int fuelCapacity, int numberOfSeats, int numberOfDoors, String model ) {
		super(fuelCapacity, numberOfSeats, numberOfDoors);
		this.model = model;
		System.out.println("Car Ford is creating...");
		// TODO Auto-generated constructor stub
	}
	
	public void musicPlayer(){
		System.out.println("Ford car comes with Music Player... ");
	}
	
	public void modelName(){
		System.out.println("car model is " + model);
	}
}
