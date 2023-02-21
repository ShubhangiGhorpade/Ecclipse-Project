package com.xworkz.equalsmethod.thing;

public class Cake {
	private String flavour;
	private int weight;
	private String shape;
	private double price;

	public Cake(String flavour, int weight, String shape, double price) {
		super();
		this.flavour = flavour;
		this.weight = weight;
		this.shape = shape;
		this.price = price;
	}

	@Override
	public String toString() {

		return "[Flavour: " + this.flavour + "][Weight: " + this.weight + "][Shape: " + this.shape + "][Price: "
				+ this.price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Cake running equals Methods: " + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Cake) {
				Cake casted = (Cake) obj;
				Cake cake = this;
				Cake cake1 = casted;

				if (cake.flavour.equals(cake1.flavour) && cake.price == (cake1.price) && cake.shape.equals(cake1.shape)
						&& cake.weight == (cake1.weight)) {
					return true;
				} else {
					System.out.println("cake and cake1 are not same");
				}
			} else {
				System.out.println("cake1 is not cake type");

			}

		} else {
			System.out.println("obj is null");
		}
		return super.equals(obj);
	}
}
