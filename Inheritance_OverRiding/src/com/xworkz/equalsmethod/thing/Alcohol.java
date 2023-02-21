package com.xworkz.equalsmethod.thing;

public class Alcohol {

	private String brand;
	private float percentage;
	private int height;
	private String type;

	public Alcohol(String brand, float percentage, int height, String type) {
		this.brand = brand;
		this.percentage = percentage;
		this.height = height;
		this.type = type;
	}

	@Override
	public String toString() {

		return "[Brand: " + this.brand + "][Percentage:" + this.percentage + "][Height: " + this.height + "][Type:"
				+ this.type+"]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Tv running equals Methods: " + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Alcohol) {
				Alcohol casted = (Alcohol) obj;
				Alcohol alcohol = this;
				Alcohol alcohol1 = casted;

				if (alcohol.brand.equals(alcohol1.brand) && alcohol1.percentage == (alcohol1.percentage)
						&& alcohol.height == (alcohol1.height) && alcohol.type.equals(alcohol1.type)) {
					return true;
				} else {
					System.out.println("alcohol and alocohol2 are not same");
				}
			} else {
				System.out.println("Alcohol1 is not alcohol type");

			}

		} else {
			System.out.println("obj is null");
		}
		return super.equals(obj);
	}

}
