package com.xworkz.override.thing;

public class SmartWatch extends Clock {

	public SmartWatch() {
		System.out.println("No Arg const in SmartWatch");
	}

	@Override
	public boolean getSmart() {
		return true;
	}
}
