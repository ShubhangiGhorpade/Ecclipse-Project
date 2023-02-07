package com.xworkz.association.thing;

public class Fridge {
	public String type;
	public double cost;
	public Brand brand;

	public void init(String type, double cost) {
		this.type = type;
		this.cost = cost;
	}

	public void init(Brand brand) {
		this.brand = brand;
	}

	public void show() {
		System.out.println("Type :" + this.type);
		System.out.println("cost :" + this.cost);
		if (brand != null) {
			this.brand.show();
		} else {
			System.err.println("this.brand.show is not pointing to any memory");
		}
	}
}
