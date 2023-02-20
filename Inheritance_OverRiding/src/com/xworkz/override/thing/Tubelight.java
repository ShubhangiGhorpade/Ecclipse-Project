package com.xworkz.override.thing;

public class Tubelight extends Light {

	public Tubelight() {
		System.out.println("No Arg const in Tubelight");
	}

	@Override
	public String getBrand() {
		System.out.println("Over ridden method in Tubelight ");
		return "Godrej";
	}

}
