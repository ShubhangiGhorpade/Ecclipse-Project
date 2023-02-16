package com.xworkz.override.boot;

import com.xworkz.override.thing.PaniPuri;
import com.xworkz.override.thing.Poori;

public class PooriRunner {

	public static void main(String[] args) {
		Poori poori = new PaniPuri();
		String shape = poori.getShape();
		System.out.println("Shape: " + shape);
		boolean oil = poori.getOil();
		System.out.println("Oily or not: " + oil);

	}

}
