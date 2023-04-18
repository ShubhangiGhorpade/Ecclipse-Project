package com.xworkz.collection.lambdaExp.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class FruitRunner {

	public static void main(String[] args) {
		Collection<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("watermeleon");
		fruits.add("pineapple");
		fruits.add("muskmelon");
		fruits.add("kiwi");
		fruits.add("grape");
		fruits.add("pomeogrante");
		fruits.add("chikku");
		fruits.add("strawberry");
		fruits.add("berry");
		fruits.add("fig");
		fruits.add("orange");
		fruits.add("Mosambi");
		fruits.add("banana");
		fruits.add("papaya");
		fruits.add("cherry");
		fruits.add("custard apple");
		fruits.add("lemon");
		fruits.add("mulberry");
		fruits.add("Apricot");
		fruits.add("pear");
		fruits.add("peach");
		fruits.add("plum");
		fruits.add("Avocado");

		Collection<String> convertedFruit = new ArrayList<>();
		for (String fruit : fruits) {
			System.out.println(fruit.toUpperCase());
			convertedFruit.add(fruit.toUpperCase());
		}
		convertedFruit.forEach(ref -> System.out.println(ref));
		System.out.println("    ");
		System.out.println("Length less than 5");

		fruits.stream().filter(ref1 -> ref1.length() < 5).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));

		System.out.println("    ");
		System.out.println("Length greater than 5");
		fruits.stream().filter(ref1 -> ref1.length() > 5).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));

		System.out.println("    ");
		System.out.println("Length less than 15 and greater than 10");
		fruits.stream().filter(ref1 -> ref1.length() > 10 && ref1.length() < 15).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));

	}

}
