package com.xworkz.association.thing;

public class Scientist {
	public String name;
	public String designation;

	public void setName(String name) {
		this.name = name;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void show() {
		System.out.println("Name:" + this.name);
		System.out.println("Deignation:" + this.designation);
	}
}
