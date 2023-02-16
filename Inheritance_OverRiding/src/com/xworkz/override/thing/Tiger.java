package com.xworkz.override.thing;

public class Tiger extends Animal {

	public Tiger() {
		System.out.println("No Arg const in Tiger");
	}

	@Override

	public boolean getWild() {
		return false;
	}
}
