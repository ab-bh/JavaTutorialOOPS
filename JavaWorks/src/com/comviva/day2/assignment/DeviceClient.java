package com.comviva.day2.assignment;


public class DeviceClient {
	public static void display(Device d){
		if(d instanceof Lamp){
			System.out.println(((Lamp)d).isOn());
		}
		else if(d instanceof NightLamp){
			System.out.println(((NightLamp)d).isOn());
		}
		else{
			System.out.println(((Projector)d).isOn());
		}
	}
	
	public static void main(String[] args) {
		
		Device [] dev_ = new Device[3];
		dev_[0] = new Lamp();
		dev_[1] = new NightLamp();
		dev_[2] = new Projector();
		
		dev_[0].off();
		dev_[1].on();
		dev_[2].on();
		
		
		display(dev_[0]);
		display(dev_[1]);
		display(dev_[2]);
		
	}
}
