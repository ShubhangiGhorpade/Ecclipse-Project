package com.xworkz.association.thing;

public class Mall {
	public String name;
	public boolean ambience;
	public int totalfloor;
	public Security security;

	public void setName(String name) {
		this.name = name;
	}

	public void setAmbience(boolean ambience) {
		this.ambience = ambience;
	}

	public void setTotalFloor(int totalfloor) {
		this.totalfloor = totalfloor;
	}

	public void setSecurity(Security security) {
		this.security = security;
	}
	public void show() {
		System.out.println("Details of Mall");
		System.out.println("Mall Name : " + this.name);
		System.out.println("Ambience: "+this.ambience);
		System.out.println("TotalFloor: "+this.totalfloor);
		if (this.security != null) {
			this.security.show();
		} else {
			System.err.println("this.security is null....");
		}
	}
}
