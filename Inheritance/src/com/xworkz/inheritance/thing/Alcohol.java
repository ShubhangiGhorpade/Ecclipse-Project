package com.xworkz.inheritance.thing;

public class Alcohol {
	private int cost;

	public void brand() {
		System.out.println("No Arg const in Alcohol");
	}

	public void setCost(int cost) {
		this.cost = cost;
		System.out.println("Int method in Whiskey");
	}

	public int getCost() {
		return this.cost;
	}

}
