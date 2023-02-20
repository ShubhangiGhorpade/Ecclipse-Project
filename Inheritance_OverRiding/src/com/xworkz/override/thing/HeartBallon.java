package com.xworkz.override.thing;

public class HeartBallon extends Balloon {

	public HeartBallon() {
		System.out.println("No Arg const in HeartBallon");
	}

	@Override
	public int getPrice() {
		System.out.println("Over ridden method in heartballoon");
		return 30;
	}
}
