package com.xworkz.accessspecifier.boot;

import com.xworkz.accessspecifier.thing.Mountain;

public class K2Mountain extends Mountain {
	public String name = "K2";

	public K2Mountain() {
		System.out.println("No Arg const in K2Mountain");
	}

	public int howManyPlaceToWatch() {
		return 5;
	}

	@Override
	public void display() {
		System.out.println("Name in K2Mountain: " + name);
	}
}
