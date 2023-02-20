package com.xworkz.override.data;

public class SugarCane {
	private String factoryName;
	private double weight;
	private int length;
	private boolean sweet;

	@Override
	public int hashCode() {

		return 500;
	}

	@Override
	public String toString() {

		return "FactoryName: " + this.factoryName + "Weight: " + this.weight + "Length: " + this.length + "Sweet: "
				+ this.isSweet();
	}

	public String getFactoryName() {
		return factoryName;
	}

	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public boolean isSweet() {
		return sweet;
	}

	public void setSweet(boolean sweet) {
		this.sweet = sweet;
	}

}
