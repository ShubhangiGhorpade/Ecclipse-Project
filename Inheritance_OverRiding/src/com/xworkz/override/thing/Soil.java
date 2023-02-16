package com.xworkz.override.thing;

public class Soil {

	public Soil() {
		System.out.println("NO Arg const in Soil");
	}

	public String getType() {
		return "Black";
	}

	public boolean getDry() {
		return false;
	}
}
