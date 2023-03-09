package com.xworkz.implementor;

import com.xworkz.rule.DanceRule;

public class Dancer implements DanceRule {
	private String dress;

	@Override
	public boolean hipHop() {
		if (this.dress == "Saree") {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean dressCode(String dress) {
		this.dress = dress;
		if (this.dress != null && dress.equals("Saree")) {
			System.out.println("Dress is Saree...");
			return false;
		} else {
			System.out.println("Dress is not saree");
		}
		return true;
	}

}
