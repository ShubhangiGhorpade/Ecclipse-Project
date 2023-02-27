package com.xworkz.association.thing;

public class Brand {
	public String brand;
	public Frame[] frame;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setFrame(Frame[] frame) {
		this.frame = frame;
	}

	public void show() {
		System.out.println("Brand: " + this.brand);
		if (this.frame != null) {
			for (int seq = 0; seq < this.frame.length; seq++) {
				Frame element = this.frame[seq];
				element.display();
			}
		} else {
			System.out.println("this.frame not null");
		}
	}
}
