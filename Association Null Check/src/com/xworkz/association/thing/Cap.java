package com.xworkz.association.thing;

public class Cap {
	public String brand;
	public String colour;

	public void init(String brand, String colour) {
		this.brand = brand;
		this.colour = colour;
	}

	public void show() {
		System.out.println("Brand :" + this.brand);
		System.out.println("Colour :" + this.colour);
	}
}
