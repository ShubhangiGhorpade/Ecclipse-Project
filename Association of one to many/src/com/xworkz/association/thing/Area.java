package com.xworkz.association.thing;

public class Area {
	public String name;
	public double population;
	public String street;

	public void setName(String name) {
		this.name = name;
	}

	public void setPopulation(double population) {
		this.population = population;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void show() {
		System.out.println("Details of Area");
		System.out.println("Area Name : " + this.name);
		System.out.println("Area Population : " + this.population);
		System.out.println("Area Street : " + this.street);
	}
}
