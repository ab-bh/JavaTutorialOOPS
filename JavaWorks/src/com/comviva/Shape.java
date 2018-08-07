package com.comviva;

public abstract class Shape {
	public abstract void area();
	
	
	
	// in abstract class you can have concrete method's 
	public void draw(){
		System.out.println("Drawing shape with pen/pencil...");
	}
}
