package com.java.association.main;

public class JawaBike {
	public String brand;
	public double cost;
	public int manufacturedYear;
	public Engine e = new Engine();

	public void init(String brand, double cost, int manufacturedYear) {
		this.brand = brand;
		this.cost = cost;
		this.manufacturedYear = manufacturedYear;
	}

	public void show() {
		System.out.println("Brand :" + this.brand);
		System.out.println("Cost :" + this.cost);
		System.out.println("Manufactured Year :" + this.manufacturedYear);
		System.out.println("   Association   ");
		this.e.show();
	}
}
