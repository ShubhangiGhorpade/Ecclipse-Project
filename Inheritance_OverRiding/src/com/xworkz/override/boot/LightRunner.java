package com.xworkz.override.boot;

import com.xworkz.override.thing.Light;
import com.xworkz.override.thing.Tubelight;

public class LightRunner {
	public static void main(String[] args) {
		Light light = new Tubelight();
		String brand = light.getBrand();
		System.out.println(brand);
		int price = light.getPrice();
		System.out.println(price);
	}
}
