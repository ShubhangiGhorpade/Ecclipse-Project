package com.file.instanceVar;
//10
public class Umbrella {
public int cost ;
public boolean rainy;
public String colour;
public String material;
public int length;
public int height;
public int weight;
public String usedFor;
public String manufactured;
public boolean available;

public Umbrella(int cost,boolean rainy,String colour,String material,int length,int height,
		int weight,String usedFor,String manufactured,boolean available) {
	this.cost=cost;
	this.rainy=rainy;
	this.colour=colour;
	this.material=material;
	this.length=length;
	this.height=height;
	this.weight=weight;
	this.usedFor=usedFor;
	this.manufactured=manufactured;
	this.available=available;
}
public void show() {
	System.out.println("Cost :"+this.cost);
	System.out.println("Rainy :"+this.rainy);
	System.out.println("Colour :"+this.colour);
	System.out.println("Material :"+this.material);
	System.out.println("Length :"+this.length);
	System.out.println("Height :"+this.height);
	System.out.println("Weight :"+this.weight);
	System.out.println("Used for :"+this.usedFor);
	System.out.println("Manufactured :"+this.manufactured);
	System.out.println("Available :"+this.available);
}
}
