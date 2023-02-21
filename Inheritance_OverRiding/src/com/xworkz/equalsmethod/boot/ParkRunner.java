package com.xworkz.equalsmethod.boot;

import com.xworkz.equalsmethod.thing.Park;

public class ParkRunner {

	public static void main(String[] args) {
		Park park = new Park("TMC", true, 4, 9, true, false);
		System.out.println(park);

		Park park1 = new Park("KC", true, 3, 8, false, true);
		System.out.println(park1);

		Park park2 = new Park("TMC", true, 4, 9, true, false);
		System.out.println(park2);

		boolean equal = park.equals(park1);
		System.out.println(equal);

		boolean equal1 = park1.equals(park2);
		System.out.println(equal1);

		boolean equal2 = park2.equals(park);
		System.out.println(equal2);

	}

}
