package com.xworkz.override.dataRunner;

import com.xworkz.override.data.Paint;

public class PaintRunner {

	public static void main(String[] args) {
		Paint paint = new Paint();
		paint.setBrand("Asian Paint");
		paint.setPrice(5000);
		paint.setValidity(2024);
		paint.setGood(false);
		String brand = paint.getBrand();
		System.out.println("Brand: " + brand);
		double price = paint.getPrice();
		System.out.println("Price: " + price);
		int validity = paint.getValidity();
		System.out.println("Validity: " + validity);
		boolean good = paint.isGood();
		System.out.println("Good or not: " + good);
		System.out.println(
				"Override hashcode: " + paint.hashCode() + " Original hashcode: " + System.identityHashCode(paint));

		Paint paint1 = new Paint();
		paint1.setBrand("Nippon");
		paint1.setPrice(2500);
		paint1.setValidity(2025);
		paint1.setGood(true);
		String brand1 = paint1.getBrand();
		System.out.println("Brand1: " + brand1);
		double price1 = paint1.getPrice();
		System.out.println("Price1: " + price1);
		int validity1 = paint1.getValidity();
		System.out.println("Validity1: " + validity1);
		boolean good1 = paint1.isGood();
		System.out.println("Good or not: " + good1);
		System.out.println(
				"Override hashcode: " + paint1.hashCode() + " Original hashcode: " + System.identityHashCode(paint1));

		boolean b1 = paint.equals(paint1);
		System.out.println(b1);

	}

}
