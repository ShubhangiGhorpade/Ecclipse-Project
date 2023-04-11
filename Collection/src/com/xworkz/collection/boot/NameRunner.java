package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class NameRunner {

	public static void main(String[] args) {
		Collection<String> names = new ArrayList<>();
		names.add("Shubhangi");
		names.add("Shannu");
		names.add("Anita");
		names.add("Akashata");

		Collection<String> names1 = new ArrayList<>();
		names1.add("Shubhangi");
		names1.add("Hassu");

		boolean retainAll = names.retainAll(names1);
		System.out.println(retainAll);
		// only shubhangi will be present or modified

		boolean containsAll = names.containsAll(names1);
		System.out.println(containsAll);
		// it will check whether name contains all the elements of names1
		// if we vise versa den names1 will check whether names contain all element.

		boolean removeAll = names.removeAll(names1);
		System.out.println(removeAll);
		// it is used to remove all the element which are present both in names and
		// names1 if they are not present then it returns false

		Collection<Integer> collection = new ArrayList<>();
		collection.add(1);
		collection.add(2);
		collection.add(3);

		Integer[] array = collection.toArray(new Integer[4]);
		System.out.println(Arrays.toString(array));

		// System.out.println("Array: " + Arrays.toString(array));
		// The toArray method returns an array containing all the elements of the
		// collection in the same order.

		Integer[] array2 = collection.toArray(array);
		System.out.println(Arrays.toString(array2));
		//arrays is a class which have methods..
		
		
	}

}
