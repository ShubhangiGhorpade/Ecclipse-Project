package com.xworkz.collection.lambdaExp.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class PercentageRunner {

	public static void main(String[] args) {
		Collection<Double> percentage = new ArrayList<>();
		percentage.add(45.5);
		percentage.add(50.8);
		percentage.add(60.5);
		percentage.add(85.9);

		System.out.println(percentage);

		percentage.stream().filter(element -> element < 50).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));
		System.out.println("  ");
		percentage.stream().filter(element -> element > 50).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));

	}

}
