
package com.xworkz.association.thing;

public class Wallet {
	public String colour;
	public int cost;
	public Money money;

	public Wallet() {
		System.out.println("No arg constructor");
	}

	public void init(String colour, int cost) {
		this.colour = colour;
		this.cost = cost;
		System.out.println("String ,String method in init");
	}

	public void init(Money money) {
		this.money = money;

	}

	public void show() {
		System.out.println("colour :" + this.colour);
		System.out.println("cost :" + this.cost);
		if (money != null) {
			this.money.show();
		} else {
			System.err.println("this.money is not pointing to memory");
		}
	}
}
