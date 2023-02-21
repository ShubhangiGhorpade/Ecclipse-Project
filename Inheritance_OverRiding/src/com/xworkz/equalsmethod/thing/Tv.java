package com.xworkz.equalsmethod.thing;

public class Tv {
	private String brand;
	private double price;
	private int size;

	public Tv(String brand, double price, int size) {
		this.brand = brand;
		this.price = price;
		this.size = size;
	}

	@Override
	public String toString() {

		return "[Brand: " + this.brand + "][Price: " + this.price + "][Size: " + this.size + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Tv running equals Methods: " + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Tv) {
				Tv casted = (Tv) obj;
				Tv tv = this;
				Tv tv1 = casted;

				if (tv.brand.equals(tv1.brand) && tv.price == (tv1.price) && tv.size == (tv1.size)) {
					return true;
				} else {
					System.out.println("tv and tv1 are not same");
				}
			} else {
				System.out.println("tv1 is not tv type");

			}

		} else {
			System.out.println("obj is null");
		}
		return super.equals(obj);
	}

}
