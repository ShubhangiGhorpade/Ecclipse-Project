package com.java.association.main;

public class Camera {
	public boolean clearity;
	public float pixel;
	public int angle;

	public void init(boolean clearity, float pixel, int angle) {
		this.clearity = clearity;
		this.pixel = pixel;
		this.angle = angle;

	}

	public void show() {
		System.out.println("Clearity :" + this.clearity);
		System.out.println("Pixel :" + this.pixel);
		System.out.println("Angel :" + this.angle);
	}
}
