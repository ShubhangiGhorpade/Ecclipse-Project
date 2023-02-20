package com.xworkz.override.dataRunner;

import com.xworkz.override.data.Gold;

public class GoldRunner {

	public static void main(String[] args) {
		Gold gold = new Gold();
		gold.setBrand("Kadgil");
		gold.setGood(true);
		gold.setPrice(55000);
		gold.setType("Ring");
		String brand = gold.getBrand();
		System.out.println("Brand: " + brand);
		double price = gold.getPrice();
		System.out.println("Price: " + price);
		String type = gold.getType();
		System.out.println("Type: " + type);
		boolean good = gold.isGood();
		System.out.println("Good or not: " + good);
		System.out.println(
				"Overridden hashcode: " + gold.hashCode() + " Original hashcode: " + System.identityHashCode(gold));

		Gold gold1 = new Gold();
		gold.setBrand("Mahalbar");
		gold.setGood(true);
		gold.setPrice(52000);
		gold.setType("Braclet");
		String brand1 = gold1.getBrand();
		System.out.println("Brand1: " + brand1);
		double price1 = gold1.getPrice();
		System.out.println("Price1: " + price1);
		String type1 = gold1.getType();
		System.out.println("Type1: " + type1);
		boolean good1 = gold1.isGood();
		System.out.println("Good or not: " + good1);
		System.out.println(
				"Overridden hashcode: " + gold1.hashCode() + " Original hashcode: " + System.identityHashCode(gold1));

		boolean b1 = gold.equals(gold1);
		System.out.println(b1);
	}

}
