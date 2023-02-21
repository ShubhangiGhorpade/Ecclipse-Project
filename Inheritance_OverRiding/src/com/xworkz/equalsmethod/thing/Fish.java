package com.xworkz.equalsmethod.thing;

//5
public class Fish {
	private String name;
	private int lifeSpan;
	private String type;
	private boolean alive;
	private String colour;

	public Fish(String name, int lifeSpan, String type, boolean alive, String colour) {

		this.name = name;
		this.lifeSpan = lifeSpan;
		this.type = type;
		this.alive = alive;
		this.colour = colour;
	}

	@Override
	public String toString() {

		return "[Name: " + this.name + "][LifeSpan: " + this.lifeSpan + "][Type: " + this.type + "][Alive: "
				+ this.alive + "][Colour: " + this.colour + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Fish running equals Methods: " + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Fish) {
				Fish casted = (Fish) obj;
				Fish fish = this;
				Fish fish1 = casted;

				if (fish.name.equals(fish1.name) && fish.alive == (fish1.alive) && fish.lifeSpan == (fish1.lifeSpan)
						&& fish.colour.equals(fish1.colour) && fish.type.equals(fish1.type)) {
					return true;
				} else {
					System.out.println("fish and fish1 are not same");
				}
			} else {
				System.out.println("fish1 is not fish type");

			}

		} else {
			System.out.println("obj is null");
		}
		return super.equals(obj);
	}

}
