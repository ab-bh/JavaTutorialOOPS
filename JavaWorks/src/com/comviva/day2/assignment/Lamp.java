package com.comviva.day2.assignment;

public class Lamp implements Device {
	
	private boolean isOn;

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}


	@Override
	public void on() {
		// TODO Auto-generated method stub
		this.setOn(true);
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		this.setOn(false);
	}
	
	
	
	
}
