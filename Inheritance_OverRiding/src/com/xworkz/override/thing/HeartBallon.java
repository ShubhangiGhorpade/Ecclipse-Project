package com.xworkz.override.thing;

public class HeartBallon extends Balloon {

	public HeartBallon() {
		System.out.println("No Arg const in HeartBallon");
	}

	@Override
	public int getPrice() {
		return 30;
	}
}
