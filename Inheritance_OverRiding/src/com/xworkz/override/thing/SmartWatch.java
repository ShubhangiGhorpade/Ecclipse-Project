package com.xworkz.override.thing;

public class SmartWatch extends Clock {

	public SmartWatch() {
		System.out.println("No Arg const in SmartWatch");
	}

	@Override
	public boolean getSmart() {
		System.out.println("Over ridden method in smart watch");
		return true;
	}
}
