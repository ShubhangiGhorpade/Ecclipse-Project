package com.xworkz.equalsmethod.thing;

public class FootWare {
	private String brand;
	private int size;
	private String type;

	public FootWare(String brand, int size, String type) {
		this.brand = brand;
		this.size = size;
		this.type = type;
	}

	@Override
	public String toString() {

		return "[Brand: " + this.brand + "][Size: " + this.size + "][Type: " + this.type + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("FootWare running equals Methods: " + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof FootWare) {
				FootWare casted = (FootWare) obj;
				FootWare foot = this;
				FootWare foot1 = casted;

				if (foot.brand.equals(foot1.brand) && foot.size == (foot1.size) && foot.type.equals(foot.type)) {
					return true;
				} else {
					System.out.println("foot and foot1 are not same");
				}
			} else {
				System.out.println("foot1 is not foot type");

			}

		} else {
			System.out.println("obj is null");
		}
		return super.equals(obj);
	}

}
