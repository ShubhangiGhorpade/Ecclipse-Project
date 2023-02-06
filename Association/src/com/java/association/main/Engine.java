package com.java.association.main;

public class Engine {
	public String type;
	public boolean present;
	public int cost;

	public void init(String type, boolean present, int cost) {
		this.cost = cost;
		this.present = present;
		this.type = type;

	}

	public void show() {
		System.out.println("Cost :" + this.cost);
		System.out.println("Present :" + this.present);
		System.out.println("Type :" + this.type);
	}
}
