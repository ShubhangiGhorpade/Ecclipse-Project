package com.xworkz.constructorChaining.main;

//6
public class Animal {
	public String name;
	public boolean wild;
	public boolean pet;
	public String colour;
	public int weight;

	public Animal() {
		System.out.println("No Arg Constructor");
	}

	public Animal(String name) {
		this.name = name;
	}

	public Animal(String name, boolean wild) {
		this(name);
		this.wild = wild;
	}

	public Animal(String name, boolean wild, boolean pet) {
		this(name, wild);
		this.pet = pet;
	}

	public Animal(String name, boolean wild, boolean pet, String colour) {
		this(name, wild, pet);
		this.colour = colour;
	}

	public Animal(String name, boolean wild, boolean pet, String colour, int weight) {
		this(name, wild, pet, colour);
		this.weight = weight;
	}

	public void init(String name, boolean wild, boolean pet, String colour, int weight) {
		this.name = name;
		this.wild = wild;
		this.weight = weight;
		this.pet = pet;
		this.colour = colour;
	}

	public void show() {
		System.out.println("Name :" + this.name);
		System.out.println("Wild :" + this.wild);
		System.out.println("Pet :" + this.pet);
		System.out.println("Colour :" + this.colour);
		System.out.println("Weight :" + this.weight);
	}
}
