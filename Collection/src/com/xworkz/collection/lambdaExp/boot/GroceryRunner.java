package com.xworkz.collection.lambdaExp.boot;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.xworkz.collection.lambdaExp.dto.GroceryDTO;

public class GroceryRunner {

	public static void main(String[] args) {
		Set<GroceryDTO> grocerys = new HashSet<>();
		grocerys.add(new GroceryDTO(1, "potato", 52d, 2.5f));
		grocerys.add(new GroceryDTO(2, "brinjal", 60d, 2f));
		grocerys.add(new GroceryDTO(3, "cucumber", 60d, 5f));
		grocerys.add(new GroceryDTO(4, "wheat", 80d, 10f));
		grocerys.add(new GroceryDTO(5, "jowar", 90d, 12f));
		grocerys.add(new GroceryDTO(5, "jowar", 90d, 12f));
		grocerys.add(new GroceryDTO(5, "jowar", 90d, 12f));

		grocerys.forEach(s -> System.out.println(s));
		System.out.println("          ");
		grocerys.stream().collect(Collectors.toList()).forEach(e -> System.out.println(e));
		System.out.println("          ");
		List<GroceryDTO> grocerys1 = new ArrayList<>();
		grocerys1.add(new GroceryDTO(1, "potato", 52d, 2.5f));
		grocerys1.add(new GroceryDTO(2, "brinjal", 60d, 2f));
		grocerys1.add(new GroceryDTO(3, "cucumber", 60d, 5f));
		grocerys1.add(new GroceryDTO(4, "wheat", 80d, 10f));
		grocerys1.add(new GroceryDTO(5, "jowar", 90d, 12f));
		grocerys1.add(new GroceryDTO(6, "onion", 45d, 8f));

		System.out.println("          ");
		System.out.println("Set Method");
		grocerys1.set(2, new GroceryDTO(4, "Raddish", 65d, 2f));
		grocerys1.forEach(s -> System.out.println(s));
		System.out.println("          ");
		System.out.println("Get Method");
		grocerys1.get(2);
		grocerys1.forEach(e -> System.out.println(e));
		System.out.println("          ");
		System.out.println("Remove with index");
		grocerys1.remove(3);
		grocerys1.forEach(s -> System.out.println(s));
		
		System.out.println("          ");
		System.out.println("Iterator from reverse direction");
		ListIterator<GroceryDTO> listIterator1 = grocerys1.listIterator(5);
		while (listIterator1.hasPrevious()) {
			GroceryDTO previous = listIterator1.previous();
			System.out.println(previous);
		}
		
		System.out.println("   ");
		System.out.println("adding an element over iteration");
		ListIterator<GroceryDTO> listIterator2 = grocerys1.listIterator();
		while (listIterator2.hasNext()) {
			grocerys1.add(new GroceryDTO(7, "Dal", 105.5d, 2f));
			GroceryDTO next = listIterator2.next();
			System.out.println(next);
		}

		System.out.println("          ");
		List<GroceryDTO> grocerys2 = new ArrayList<>();
		grocerys2.add(new GroceryDTO(1, "potato", 52d, 2.5f));
		grocerys2.add(new GroceryDTO(2, "brinjal", 60d, 2f));
		grocerys2.add(new GroceryDTO(3, "cucumber", 60d, 5f));
		grocerys2.add(new GroceryDTO(4, "wheat", 80d, 10f));
		grocerys2.add(new GroceryDTO(5, "jowar", 90d, 12f));
		grocerys2.add(new GroceryDTO(6, "onion", 45d, 8f));

		System.out.println("addall.......");
		List<GroceryDTO> grocerys3 = new ArrayList<>();
		grocerys3.addAll(0, grocerys1);
		grocerys3.addAll(1, grocerys2);
		grocerys3.forEach(s -> System.out.println(s));
	}

}
