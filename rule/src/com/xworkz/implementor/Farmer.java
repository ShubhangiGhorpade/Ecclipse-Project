package com.xworkz.implementor;

import com.xworkz.rule.FarmRule;

public class Farmer implements FarmRule {
	String type;

	public Farmer() {
		System.out.println("Farmer const...");
	}

	@Override
	public boolean cropGrowth() {
		if (type == "Red") {
			System.out.println("Red soil...");
			return false;
		} else {
			System.out.println("not red soil...");
		}
		return true;
	}

	@Override
	public boolean soil(String type) {
		this.type = type;
		if (this.type != null && type.equals("Black")) {
			System.out.println("Soil is Black....");
			return false;
		} else {
			System.out.println("soil is not black");
		}
		return true;
	}

}
