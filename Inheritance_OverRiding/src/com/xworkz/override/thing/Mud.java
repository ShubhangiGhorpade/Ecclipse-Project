package com.xworkz.override.thing;

public class Mud extends Soil {

	public Mud() {
		System.out.println("No Arg const in Mud");
	}

	@Override
	public boolean getDry() {
		System.out.println("Over ridden method in Mud");
		return true;
	}

}
