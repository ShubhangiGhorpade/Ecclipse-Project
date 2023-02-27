package com.xworkz.association.thing;

public class Brand {
	public String type;
	public String colour;

	public void init(String type, String colour) {
		this.type = type;
		this.colour = colour;
	}

	public void show() {
		System.out.println("Type :" + this.type);
		System.out.println("Colour :" + this.colour);
	}

}
