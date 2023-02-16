package com.xworkz.override.thing;

public class Mud extends Soil {

	public Mud() {
		System.out.println("No Arg const in Mud");
	}

	@Override
	public boolean getDry() {
		return true;
	}

}
