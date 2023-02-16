package com.xworkz.override.boot;

import com.xworkz.override.thing.Garland;
import com.xworkz.override.thing.RoseGarland;

public class GarlandRunner {

	public static void main(String[] args) {
		Garland garland = new RoseGarland();
		int price = garland.getPrice();
		System.out.println("Price: " + price);
		boolean mixed = garland.getMixed();
		System.out.println("Mixed or not: " + mixed);
	}

}
