package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class Whiskey {

	public static void main(String[] args) {
		Collection<String> whiskeys = new ArrayList<>();
		whiskeys.add("IB");
		whiskeys.add("White & Black");
		whiskeys.add("Spirit");
		whiskeys.add("Jack Danniel");
		whiskeys.add("Jim Beam");
		whiskeys.add("Jameson");
		whiskeys.add("Bell's");
		whiskeys.add("Black Velvet");
		whiskeys.add("Knob Creek");
		whiskeys.add("Evan Williams");
		whiskeys.add(null);

		whiskeys.remove("Bell's");

		System.out.println("Total elements are :" + whiskeys.size());

		System.out.println("For each Loop ......");
		for (String whiskey : whiskeys) {
			if (whiskey != null) {
				System.out.println(whiskey);
			}
		}

		System.out.println("Iterator.......");

		Iterator<String> whiskey = whiskeys.iterator();
		while (whiskey.hasNext()) {
			String whiskey1 = whiskey.next();
			if (Objects.isNull(whiskey1)) {

				whiskey.remove();
			}
		}
		System.out.println(whiskeys);
		System.out.println(whiskeys.size());
	}
}
