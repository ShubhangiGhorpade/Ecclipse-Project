package com.xworkz.override.data;

public class Paint {

	private String brand;
	private double price;
	private int validity;
	private boolean good;

	@Override
	public int hashCode() {

		return 500;
	}

	@Override
	public String toString() {

		return "Brand: " + this.brand + "Price: " + this.price + "Validity: " + this.validity + "Good: "
				+ this.validity;
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

	public int getValidity() {
		return validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}

	public boolean isGood() {
		return good;
	}

	public void setGood(boolean good) {
		this.good = good;
	}

}
