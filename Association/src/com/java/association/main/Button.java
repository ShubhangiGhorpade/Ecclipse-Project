package com.java.association.main;

public class Button {
	public String colour;
	public String shape;
	public int cost;

	public void init(String colour, String shape, int cost) {
		this.colour = colour;
		this.cost = cost;
		this.shape = shape;

	}

	public void show() {
		System.out.println("Colour  :" + this.colour);
		System.out.println("Cost :" + this.cost);
		System.out.println("Shape :" + this.shape);
	}
}
