package com.xworkz.accessspecifier.thing;

public class Himalaya extends Mountain {
	public String name = "Himalaya";

	public Himalaya() {
		System.out.println("No Arg const in Himalaya");
	}

	public double feet() {
		return 29.03d;
	}

	@Override
	public void display() {
		System.out.println("Name in Himalaya: " + name);
	}
}
