package com.xworkz.override.dataRunner;

import com.xworkz.override.data.Coconut;

public class CoconutRunner {

	public static void main(String[] args) {
		Coconut coconut = new Coconut();
		coconut.setShape("Oval");
		coconut.setPrice(30);
		coconut.setSweet(true);
		coconut.setColour("Brown");
		String shape = coconut.getShape();
		System.out.println("Shape: " + shape);
		double price = coconut.getPrice();
		System.out.println("Price: " + price);
		String colour = coconut.getColour();
		System.out.println("Colour: " + colour);
		boolean sweet = coconut.isSweet();
		System.out.println("Sweet or not: " + sweet);
		System.out.println("overriden hashcode: " + coconut.hashCode() + "\noriginal hashcode: "
				+ System.identityHashCode(coconut));

		Coconut coconut1 = new Coconut();
		coconut1.setShape("Round");
		coconut1.setPrice(20);
		coconut1.setSweet(true);
		coconut1.setColour("Green");
		String shape1 = coconut1.getShape();
		System.out.println("Shape1: " + shape1);
		double price1 = coconut1.getPrice();
		System.out.println("Price1: " + price1);
		String colour1 = coconut1.getColour();
		System.out.println("Colour1: " + colour1);
		boolean sweet1 = coconut1.isSweet();
		System.out.println("Sweet or not: " + sweet1);
		System.out.println("overriden hashcode1: " + coconut1.hashCode() + "\noriginal hashcode: "
				+ System.identityHashCode(coconut1));

		boolean b1 = coconut.equals(coconut1);
		System.out.println(b1);
	}

}
