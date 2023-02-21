package com.xworkz.equalsmethod.thing;

public class WaterFall {

	private String name;
	private int height;
	private String location;

	public WaterFall(String name, int height, String location) {
		this.name = name;
		this.height = height;
		this.location = location;
	}

	@Override
	public String toString() {

		return "[Name: " + this.name + "][Height: " + this.height + "][Location: " + this.location + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("WaterFall running equals Methods: " + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof WaterFall) {
				WaterFall casted = (WaterFall) obj;
				WaterFall fall = this;
				WaterFall fall1 = casted;

				if (fall.name.equals(fall1.name) && fall.height == (fall1.height)
						&& fall.location.equals(fall1.location)) {
					return true;
				} else {
					System.out.println("fall and fall1 are not same");
				}
			} else {
				System.out.println("fall1 is not fall type");

			}

		} else {
			System.out.println("obj is null");
		}
		return super.equals(obj);
	}
}
