package com.xworkz.association.thing;

public class Surprise {
	public boolean excited;
	public boolean happy;

	public void init(boolean excited, boolean happy) {
		this.excited = excited;
		this.happy = happy;
	}

	public void show() {
		System.out.println("Excited :" + this.excited);
		System.out.println("Happy :" + this.happy);
	}
}
