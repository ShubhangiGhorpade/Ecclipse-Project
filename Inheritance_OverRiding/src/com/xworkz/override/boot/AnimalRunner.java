package com.xworkz.override.boot;

import com.xworkz.override.thing.Animal;
import com.xworkz.override.thing.Tiger;

public class AnimalRunner {

	public static void main(String[] args) {
		Animal animal = new Tiger();
		boolean wild = animal.getWild();
		System.out.println("Wild or not: " + wild);
		boolean strong = animal.getStrong();
		System.out.println("Strong or not: " + strong);

	}

}
