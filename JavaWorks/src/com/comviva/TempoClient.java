package com.comviva;

public class TempoClient {
	
	
	public static void doMyJob(TempoTraveller c){
		System.out.println("***********Temopo details goes here****************");
		System.out.println("Fuel Capacity"+ c.getFuelCapacity());
		c.numberOfDoors();
		c.numberOfSeats();
		
		if(c instanceof SwarajMazda){
			((SwarajMazda) c).modelName();
			((SwarajMazda) c).carWheels();
			System.out.println("the mazda has abs? "+ ((SwarajMazda) c).isAbs());
		}else if(c instanceof Monster){
			((Monster) c).carWheels();
			System.out.println("the mazda has abs? "+ ((Monster) c).isAbs());
			((Monster) c).modelName();
		}
	}
	
	
	
	
	public static void main(String[] args) {
		TempoTraveller [] tempo = new TempoTraveller[5];
		tempo[0] = new SwarajMazda(40,true, 4, 4, "mazda");
		tempo[1] = new Monster(45, true, 3, 4, "wagon");
		
		tempo[2] = new SwarajMazda(46, true,  3, 2, "hulu");
		tempo[3] = new Monster(34, true, 5, 2, "ergjer");
		
		tempo[4] = new SwarajMazda(56, true, 3, 3, "bla");
		
		for(TempoTraveller temp: tempo){
			doMyJob(temp);
		}
	}
}
