package com.xworkz.override.dataRunner;

import com.xworkz.override.data.Adike;

public class AdikeRunner {

	public static void main(String[] args) {
		Adike adike = new Adike();
		adike.setShape("Round");
		adike.setPrice(10);
		adike.setWeight(2);
		adike.setColour("Brown");
		String shape = adike.getShape();
		System.out.println("Shape: " + shape);
		double price = adike.getPrice();
		System.out.println("Price: " + price);
		int weight = adike.getWeight();
		System.out.println("Weight: " + weight);
		String colour = adike.getColour();
		System.out.println("Colour: " + colour);
		System.out.println(
				"Overiden hashcode:  " + adike.hashCode() + " Original hashcode: " + System.identityHashCode(adike));

		Adike adike1 = new Adike();
		adike1.setShape("Oval");
		adike1.setPrice(8);
		adike1.setWeight(1);
		adike1.setColour("Black");
		String shape1 = adike1.getShape();
		System.out.println("Shape1: " + shape1);
		double price1 = adike1.getPrice();
		System.out.println("Price1: " + price1);
		int weight1 = adike1.getWeight();
		System.out.println("Weight1: " + weight1);
		String colour1 = adike1.getColour();
		System.out.println("Colour1: " + colour1);
		System.out.println("Overiden hashcode1:  " + adike1.hashCode() + " Original hashcode1: "
				+ System.identityHashCode(adike1));

		boolean equal = adike.equals(adike1);
		System.out.println(equal);

	}

}
