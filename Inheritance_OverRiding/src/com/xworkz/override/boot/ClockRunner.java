package com.xworkz.override.boot;

import com.xworkz.override.thing.Clock;
import com.xworkz.override.thing.SmartWatch;

public class ClockRunner {

	public static void main(String[] args) {
		Clock clock = new SmartWatch();
		int price = clock.getPrice();
		System.out.println("Price: " + price);
		boolean smart = clock.getSmart();
		System.out.println("Smart or not: " + smart);
	}

}
