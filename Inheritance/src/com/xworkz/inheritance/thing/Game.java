package com.xworkz.inheritance.thing;

public class Game {
	
	private String name;
	
	public Game() {
		System.out.println("No Arg const in Game");
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
}
