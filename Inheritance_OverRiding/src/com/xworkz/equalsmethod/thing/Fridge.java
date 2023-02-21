package com.xworkz.equalsmethod.thing;

//12
public class Fridge {
	private String brand;
	private double price;
	private int warranty;
	private int yearOfManufacture;
	private boolean quality;
	private boolean cheap;
	private int purchasedYear;
	private String purchasedMonth;
	private int purchasedDate;
	private String features;
	private int noOfDoor;
	private int coolant;

	public Fridge(String brand, double price, int warranty, int yearOfManufacture, boolean quality, boolean cheap,
			int purchasedYear, String purchasedMonth, int purchasedDate, String features, int noOfDoor, int coolant) {

		this.brand = brand;
		this.price = price;
		this.warranty = warranty;
		this.yearOfManufacture = yearOfManufacture;
		this.quality = quality;
		this.cheap = cheap;
		this.purchasedYear = purchasedYear;
		this.purchasedMonth = purchasedMonth;
		this.purchasedDate = purchasedDate;
		this.features = features;
		this.noOfDoor = noOfDoor;
		this.coolant = coolant;
	}

	@Override
	public String toString() {

		return "[Brand: " + this.brand + "][Price: " + this.price + "][Warranty: " + this.warranty
				+ "][Year Of Manufacture: " + this.yearOfManufacture + "][Quality: " + this.quality + "][Cheap: "
				+ this.cheap + "][PurchasedYear: " + this.purchasedYear + "][PurchasedMonth: " + this.purchasedMonth
				+ "][PurchasedDate: " + this.purchasedDate + "][Features: " + this.features + "][Coolant: "
				+ this.coolant + "][No of door: " + this.noOfDoor + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Fridge running equals Methods: " + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Fridge) {
				Fridge casted = (Fridge) obj;
				Fridge fridge = this;
				Fridge fridge1 = casted;

				if (fridge.cheap == (fridge1.cheap) && fridge.coolant == fridge1.coolant
						&& fridge.brand.equals(fridge1.brand) && fridge.noOfDoor == (fridge1.noOfDoor)
						&& fridge.price == fridge1.price && fridge.purchasedDate == (fridge1.purchasedDate)
						&& fridge.features.equals(fridge1.features) && fridge.purchasedYear == fridge1.purchasedYear
						&& fridge.warranty == fridge1.warranty && fridge.purchasedMonth.equals(fridge1.purchasedMonth)
						&& fridge.quality == fridge1.quality && fridge.yearOfManufacture == fridge1.yearOfManufacture) {
					return true;
				} else {
					System.out.println("fridge and fridge1 are not same");
				}
			} else {
				System.out.println("fridge1 is not fridge type");

			}

		} else {
			System.out.println("obj is null");
		}
		return super.equals(obj);
	}

}
