package com.xworkz.override.thing;

public class RoseGarland extends Garland {

	public RoseGarland() {
		System.out.println("No Arg const in Rose Garland");
	}

	@Override
	public boolean getMixed() {
		return true;
	}
}
