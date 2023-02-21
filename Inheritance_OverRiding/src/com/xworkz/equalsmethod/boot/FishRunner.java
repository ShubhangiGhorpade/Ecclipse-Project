package com.xworkz.equalsmethod.boot;

import com.xworkz.equalsmethod.thing.Fish;

public class FishRunner {

	public static void main(String[] args) {
		Fish fish = new Fish("Gold", 15, "oranda", true, "Golden");
		System.out.println(fish);

		Fish fish1 = new Fish("Gold", 15, "oranda", true, "Golden");
		System.out.println(fish1);

		Fish fish2 = new Fish("CatFish", 60, "channel", true, "blue");
		System.out.println(fish2);

		boolean equal = fish.equals(fish1);
		System.out.println(equal);

		boolean equal1 = fish2.equals(fish1);
		System.out.println(equal1);

		boolean equal2 = fish.equals(fish2);
		System.out.println(equal2);

	}

}
