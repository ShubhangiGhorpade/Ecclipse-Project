package com.xworkz.override.dataRunner;

import com.xworkz.override.data.SugarCane;

public class SugarCaneRunner {

	public static void main(String[] args) {
		SugarCane cane = new SugarCane();
		cane.setFactoryName("Nirani");
		cane.setLength(25);
		cane.setSweet(true);
		cane.setWeight(25);
		String name = cane.getFactoryName();
		System.out.println("Name: " + name);
		int length = cane.getLength();
		System.out.println("Length: " + length);
		double weight = cane.getWeight();
		System.out.println("Weight: " + weight);
		boolean sweet = cane.isSweet();
		System.out.println("Sweet: " + sweet);
		System.out.println(
				"Over ride hashcode: " + cane.hashCode() + " Original hashcode: " + System.identityHashCode(cane));

		SugarCane cane1 = new SugarCane();
		cane1.setFactoryName("Nandhi");
		cane1.setLength(30);
		cane1.setSweet(false);
		cane1.setWeight(30);
		String name1 = cane1.getFactoryName();
		System.out.println("Name1: " + name1);
		int length1 = cane1.getLength();
		System.out.println("Length1: " + length1);
		double weight1 = cane1.getWeight();
		System.out.println("Weight1: " + weight1);
		boolean sweet1 = cane1.isSweet();
		System.out.println("Sweet1: " + sweet1);
		System.out.println(
				"Over ride hashcode: " + cane1.hashCode() + " Original hashcode: " + System.identityHashCode(cane1));

		boolean b1 = cane.equals(cane1);
		System.out.println(b1);

	}

}
