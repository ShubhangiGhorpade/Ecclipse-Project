package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

public class ShoeRunner {

	public static void main(String[] args) {
		Collection<Integer> menShoeSize = new ArrayList<>();
		menShoeSize.add(6);
		menShoeSize.add(7);
		menShoeSize.add(8);
		menShoeSize.add(9);
		menShoeSize.add(10);

		Collection<Integer> womenShoeSize = new ArrayList<>();
		womenShoeSize.add(4);
		womenShoeSize.add(5);
		womenShoeSize.add(6);
		womenShoeSize.add(7);
		womenShoeSize.add(8);

		Collection<Integer> kidShoeSize = new ArrayList<>();
		kidShoeSize.add(2);
		kidShoeSize.add(3);

		Collection<Integer> allShoeSize = new ArrayList<>();
		allShoeSize.addAll(menShoeSize);
		allShoeSize.addAll(womenShoeSize);
		allShoeSize.addAll(kidShoeSize);

		System.out.println(allShoeSize);

	
	}

}
