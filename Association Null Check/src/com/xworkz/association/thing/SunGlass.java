package com.xworkz.association.thing;

public class SunGlass {
	public String brand;
	public int cost;
	public Frame frame;

	public void init(String brand, int cost) {
		this.brand = brand;
		this.cost = cost;
	}

	public void init(Frame frame) {
		this.frame = frame;
	}

	public void show() {
		System.out.println("Brand :" + this.brand);
		System.out.println("Cost :" + this.cost);
		if (frame != null) {
			this.frame.show();
		} else {
			System.err.println("this.frame.show() is not pointing to any memory");
		}
	}
}
