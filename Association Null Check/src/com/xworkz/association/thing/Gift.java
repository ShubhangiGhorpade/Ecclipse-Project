package com.xworkz.association.thing;

public class Gift {
	public String type;
	public boolean good;
	public Surprise surprise;

	public void init(String type, boolean good) {
		this.type = type;
		this.good = good;
	}

	public void init(Surprise surprise) {
		this.surprise = surprise;
	}

	public void show() {
		System.out.println("Type :" + this.type);
		System.out.println("Good :" + this.good);
		if (surprise != null) {
			this.surprise.show();
		} else {
			System.err.println("this.surprise.show() is not pointing to any memory");
		}
	}
}
