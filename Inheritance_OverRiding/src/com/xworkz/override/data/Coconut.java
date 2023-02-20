package com.xworkz.override.data;

public class Coconut {

	private String shape;
	private int price;
	private boolean sweet;
	private String colour;

	@Override
	public String toString() {
		System.out.println("To string method in coconut");
		return "Shape: " + this.shape + "/nPrice: " + this.price + "Sweet: " + this.sweet + "/nColour: " + this.colour;
	}

	@Override
	public int hashCode() {

		return 500;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isSweet() {
		return sweet;
	}

	public void setSweet(boolean sweet) {
		this.sweet = sweet;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
