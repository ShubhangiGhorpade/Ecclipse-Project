package com.xworkz.override.boot;

import com.xworkz.override.thing.Balloon;
import com.xworkz.override.thing.HeartBallon;

public class BalloonRunner {

	public static void main(String[] args) {
		Balloon balloon = new HeartBallon();
		int price = balloon.getPrice();
		System.out.println("Price: " + price);
		int expandInCm = balloon.getExpandInCm();
		System.out.println("ExpandInCm: " + expandInCm);
	}

}
