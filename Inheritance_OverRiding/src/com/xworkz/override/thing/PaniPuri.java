package com.xworkz.override.thing;

public class PaniPuri extends Poori {

	public PaniPuri() {
		System.out.println("No Arg const in PaniPuri");
	}

	@Override
	public String getShape() {
		return "Round";
	}
}
