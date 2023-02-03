package com.xworkz.constructorChaining.main;
//name,population,district,state,country

public class Place {
	public String name;
	public double population;
	public String district;
	public String state;
	public String country;

	public Place() {
		System.out.println("No-Arg constructor");
	}

	public Place(String name, String district, String country, String state, double population) {
		this(name, district);
		this.country = country;
		this.state = state;
		this.population = population;
		System.out.println("calling constructor of name,district,country,state and population");
	}

	public Place(String name, String district) {
		this.name = name;
		this.district = district;
		System.out.println("calling constructor of name,district");
	}

	public Place(double population) {
		this.population = population;
		System.out.println("calling constructor of population");
	}

	public Place(String country) {
		this.country = country;
	}

	public void init(String name, String district, String state, String country, double population) {
		this.name = name;
		this.district = district;
		this.state = state;
		this.country = country;
		this.population = population;
	}

	public void show() {
		System.out.println("Name :" + this.name);
		System.out.println("District :" + this.district);
		System.out.println("State :" + this.state);
		System.out.println("Country :" + this.country);
		System.out.println("Population :" + this.population);

	}
}
