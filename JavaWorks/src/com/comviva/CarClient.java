package com.comviva;

public class CarClient {
	
	
	public static void doMyJob(Car c){
		System.out.println("***********Car details goes here****************");
		System.out.println("Fuel Capacity"+ c.getFuelCapacity());
		c.numberOfDoors();
		c.numberOfSeats();
		
		if(c instanceof Ford){
			((Ford)c).musicPlayer();
			((Ford) c).modelName();
		}else if(c instanceof Maruti){
			System.out.println("Maruti car has ABS "+((Maruti)c).isAbs());
			((Maruti) c).modelName();
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Car [] cars = new Car[5];
		cars[0] = new Ford(40, 4, 4, "figo");
		cars[1] = new Maruti(45, true, 4, 4, "wagonR");
		
		cars[2] = new Ford(46, 4, 4, "figo");
		cars[3] = new Maruti(34, true, 4, 4, "800");
		
		cars[4] = new Ford(56, 4, 4, "blabla");
		
		for(Car temp: cars){
			doMyJob(temp);
		}
	}
}
