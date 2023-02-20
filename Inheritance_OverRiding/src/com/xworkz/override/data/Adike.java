package com.xworkz.override.data;

public class Adike {

	private String shape;
	private double price;
	private int weight;
	private String colour;

	public Adike() {
		System.out.println("No Arg constructor in Adike");
	}

	@Override
	public String toString() {
		System.out.println("To String method");
		return "Shape : " + this.shape + "/nPrice : " + this.price + "/nWeight :" + this.weight + "" + "/nColour : "
				+ this.colour;
	}

	@Override
	public int hashCode() {
		System.out.println("Hashcode method");
		return 500;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getShape() {
		return shape;
	}

	public double getPrice() {
		return price;
	}

	public int getWeight() {
		return weight;
	}

	public String getColour() {
		return colour;
	}
}
