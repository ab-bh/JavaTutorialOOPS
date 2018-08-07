package com.comviva;

public class Name {
	private String fName;
	private String lName;
	
	public String getfName() {
		return fName;
	}

	@Override
	public String toString() {
		return fName + " " + lName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
}
