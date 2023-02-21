package com.xworkz.override.data;

public class Door {

	private boolean open;
	private String material;
	private String shape;
	private int price;

	@Override
	public int hashCode() {

		return 500;
	}

	@Override
	public String toString() {

		return "Open: " + this.open + "/nMaterial: " + this.material + "Shape: " + this.shape + "Price: " + this.price;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
