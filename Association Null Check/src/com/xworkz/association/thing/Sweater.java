package com.xworkz.association.thing;

public class Sweater {
	public String brand;
	public boolean capPresent;
	public Cap cap;

	public void init(String brand, boolean capPresent) {
		this.brand = brand;
		this.capPresent = capPresent;
	}

	public void init(Cap cap) {
		this.cap = cap;
	}

	public void show() {
		System.out.println("Brand :" + this.brand);
		System.out.println("Cap present :" + this.capPresent);
		if (cap != null) {
			this.cap.show();
		} else {
			System.out.println("this.cap.show() is not pointing to memory");
		}
	}
}
