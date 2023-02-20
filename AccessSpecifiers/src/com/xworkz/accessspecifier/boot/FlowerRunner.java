package com.xworkz.accessspecifier.boot;

import com.xworkz.accessspecifier.thing.Flower;
import com.xworkz.accessspecifier.thing.Jasmine;
import com.xworkz.accessspecifier.thing.Rose;

public class FlowerRunner {
	public static void main(String[] args) {

		Flower flower = new Flower();
		flower.setName("Lily");
		System.out.println(flower.getName());

		Flower flower1 = new Rose();
		flower.setName("Mogra");
		System.out.println(flower1.getName());
		Rose casted = (Rose) flower1;
		casted.setPrice(50);
		System.out.println(casted.getPrice());

		Flower flower2 = new Jasmine();
		flower2.setName("Defodil");
		System.out.println(flower2.getName());
		Jasmine casted1 = (Jasmine) flower2;
		casted1.setColour("Pink");
		System.out.println(casted1.getColour());

	}
}