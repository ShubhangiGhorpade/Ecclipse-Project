package com.xworkz.override.thing;

public class PaniPuri extends Poori {

	public PaniPuri() {
		System.out.println("No Arg const in PaniPuri");
	}

	@Override
	public String getShape() {
		System.out.println("Over ridden method in Panipuri");
		return "Round";
	}
}
