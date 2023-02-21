package com.xworkz.equalsmethod.boot;

import com.xworkz.equalsmethod.thing.Fridge;

public class FridgeRunner {

	public static void main(String[] args) {
		Fridge fridge = new Fridge("LG", 65000d, 3, 2021, true, false, 2022, "August", 21, "Good", 2, 1);
		System.out.println(fridge);

		Fridge fridge1 = new Fridge("LG", 65000d, 3, 2021, true, false, 2022, "August", 21, "Good", 2, 1);
		System.out.println(fridge1);

		Fridge fridge2 = new Fridge("Godrej", 55000d, 1, 2020, true, false, 2020, "September", 9, "bad", 3, 2);
		System.out.println(fridge2);

		boolean equal = fridge.equals(fridge1);
		System.out.println(equal);

		boolean equal1 = fridge1.equals(fridge2);
		System.out.println(equal1);

		boolean equal2 = fridge2.equals(fridge);
		System.out.println(equal2);
	}

}
