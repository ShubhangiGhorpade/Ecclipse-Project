package com.xworkz.implementor;

import com.xworkz.rule.EatingRule;

public class Customer implements EatingRule {

	private String name;

	public Customer() {
		System.out.println("Running in customer");
	}

	@Override
	public boolean washedHands(String name) {
		if (this.name != name && name.equals("Hassu")) {
			System.out.println("Hassu didn't wash hand");
			return false;
		} else {
			System.out.println("Hassu wash hand");
		}
		return true;
	}

	@Override
	public double durationTaken() {
		if (this.name == "Hassu") {
			return 50;
		} else {
			return 30;
		}

	}

}
