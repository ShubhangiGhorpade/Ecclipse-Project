package com.xworkz.accessspecifier.thing;

public class Mountain {
	public String name;

	public Mountain() {
		System.out.println("No Arg const in Mounntain");
	}

	public int totalVisitors() {
		return 6000;
	}

	public void display() {
		System.out.println("Name: " + name);
	}
}
