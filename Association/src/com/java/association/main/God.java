package com.java.association.main;

public class God {
	public String name;
	public boolean visible;
	public boolean faith;

	public void init(String name, boolean visible, boolean faith) {
		this.name = name;
		this.visible = visible;
		this.faith = faith;
	}

	public void show() {
		System.out.println("Name :" + this.name);
		System.out.println("Visible :" + this.visible);
		System.out.println("faith :" + this.faith);
	}
}
