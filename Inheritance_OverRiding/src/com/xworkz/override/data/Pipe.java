package com.xworkz.override.data;

public class Pipe {
	private String name;
	private double price;
	private double length;
	private int weight;

	@Override
	public int hashCode() {

		return 500;
	}

	@Override
	public String toString() {

		return "Name: " + this.name + "Price: " + this.price + "Length: " + this.length + "Weight: " + this.weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
