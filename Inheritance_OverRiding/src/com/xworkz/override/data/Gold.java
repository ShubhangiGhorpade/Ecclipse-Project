package com.xworkz.override.data;

public class Gold {

	private String brand;
	private double price;
	private boolean good;
	private String type;

	@Override
	public int hashCode() {

		return 500;
	}

	@Override
	public String toString() {

		return "Brand: " + this.brand + "Price: " + this.price + "Good: " + this.good + "Type: " + this.type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isGood() {
		return good;
	}

	public void setGood(boolean good) {
		this.good = good;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
