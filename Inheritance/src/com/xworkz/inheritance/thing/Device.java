package com.xworkz.inheritance.thing;

public class Device {

	private String brand;

	public Device() {
		System.out.println("No-Arg const in Device");
	}

	public void setBrand(String brand) {
		this.brand = brand;
		System.out.println("Brand in Device");
	}

	public String getBrand() {
		return this.brand;
	}
}
