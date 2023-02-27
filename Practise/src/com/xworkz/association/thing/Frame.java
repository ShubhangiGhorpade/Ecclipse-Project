package com.xworkz.association.thing;

public class Frame {

	public String name;
	public double price;
	public String[] type;

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setType(String[] type) {
		this.type = type;
	}

	public void display() {
		System.out.println("Name: " + this.name);
		System.out.println("Price: " + this.price);
		for (int seq = 0; seq < this.type.length; seq++) {
			String element = this.type[seq];
			System.out.println("Type: " + element + " " + seq);
		}
	}

}
