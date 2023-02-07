package com.xworkz.association.thing;

public class Sun {
	public boolean visible;
	public boolean clear;

	public void init(boolean visible, boolean clear) {
		this.visible = visible;
		this.clear = clear;
	}

	public void show() {
		System.out.println("Visible :" + this.visible);
		System.out.println("Clear :" + this.clear);
		}
}
