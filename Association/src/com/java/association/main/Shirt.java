package com.java.association.main;

public class Shirt {
	public String brand;
	public double cost;
	public boolean fullsleeves;
	public Button b = new Button();

	public void init(String brand, double cost, boolean fullsleeves) {
		this.brand = brand;
		this.cost = cost;
		this.fullsleeves = fullsleeves;

	}

	public void show() {
		System.out.println("Brand :" + this.brand);
		System.out.println("Cost :" + this.cost);
		System.out.println("Fullsleeves :" + this.fullsleeves);
		System.out.println("   Association       ");
		this.b.show();
	}
}
