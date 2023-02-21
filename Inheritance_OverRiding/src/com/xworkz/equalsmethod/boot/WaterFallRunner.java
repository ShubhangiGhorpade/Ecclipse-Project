package com.xworkz.equalsmethod.boot;

import com.xworkz.equalsmethod.thing.WaterFall;

public class WaterFallRunner {

	public static void main(String[] args) {
		WaterFall fall = new WaterFall("KokakFall", 120, "Kokak");
		System.out.println(fall);

		WaterFall fall1 = new WaterFall("KokakFall", 120, "Kokak");
		System.out.println(fall1);

		WaterFall fall2 = new WaterFall("Jog", 250, "Shivmoga");
		System.out.println(fall2);

		boolean equal = fall.equals(fall1);
		System.out.println(equal);

		boolean equal1 = fall1.equals(fall2);
		System.out.println(equal1);

		boolean equal2 = fall.equals(fall2);
		System.out.println(equal2);
	}

}
