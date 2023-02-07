package com.xworkz.association.thing;

public class Money {
	public boolean paper;
	public boolean coin;

	public void init(boolean paper, boolean coin) {
		this.paper = paper;
		this.coin = coin;
	}

	public void show() {
		System.out.println("paper :" + this.paper);
		System.out.println("coin :" + this.coin);
	}
}
