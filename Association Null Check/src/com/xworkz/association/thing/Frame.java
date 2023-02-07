package com.xworkz.association.thing;

public class Frame {
	public int pixel;
	public boolean visible;

	public void init(int pixel, boolean visible) {
		this.pixel = pixel;
		this.visible = visible;
	}

	public void show() {
		System.out.println("Pixel :" + this.pixel);
		System.out.println("Visible :" + this.visible);
	}
}
