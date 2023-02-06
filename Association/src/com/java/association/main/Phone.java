package com.java.association.main;

public class Phone {
	public String brand;
	public double cost;
	public int ram;
	public Camera c=new Camera();

	public void init(String brand, double cost, int ram) {
		this.brand = brand;
		this.cost = cost;
		this.ram = ram;
	}

	public void display() {
		System.out.println("Brand :" + this.brand);
		System.out.println("Cost :" + this.cost);
		System.out.println("RAM :" + this.ram);
		System.out.println("   Association       ");
		this.c.show();
	}
}
