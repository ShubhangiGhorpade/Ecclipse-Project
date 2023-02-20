package com.xworkz.accessspecifier.thing;

public class Flower {
	private String name;

	public Flower() {
		System.out.println("No Arg const in Flower");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
