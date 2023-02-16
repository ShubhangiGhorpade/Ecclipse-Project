package com.xworkz.override.thing;

public class Clock {
	public Clock() {
		System.out.println("No Arg const in clock");
	}

	public int getPrice() {
		return 500;
	}

	public boolean getSmart() {
		return false;
	}
}
