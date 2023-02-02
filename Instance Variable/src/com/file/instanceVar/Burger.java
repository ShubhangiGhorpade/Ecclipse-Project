package com.file.instanceVar;
//15
public class Burger {
public String type;
public int cost;
public String ingredient;
public String hotelName;
public String location;
public String chefName;
public String effect;
public String benefit;
public int fats;
public int carbohydrates;
public int calories;
public int quantity;
public boolean tasty;
public boolean veg;
public boolean healthy;

public Burger(String type,int cost,String ingredient,String hotelName,String location,String chefName,
		String effect,String benefit,int fats,int carbohydrates,int calories,int quantity,
		boolean tasty,boolean veg,boolean healthy) {
	this.type=type;
	this.cost=cost;
	this.ingredient=ingredient;
	this.hotelName=hotelName;
	this.location=location;
	this.chefName=chefName;
	this.effect=effect;
	this.benefit=benefit;
	this.fats=fats;
	this.carbohydrates=carbohydrates;
	this.calories=calories;
	this.quantity=quantity;
	this.tasty=tasty;
	this.veg=veg;
	this.healthy=healthy;
}

public void show() {
	System.out.println("Type :"+this.type);
	System.out.println("Benefit :"+this.benefit);
	System.out.println("Calories :"+this.calories);
	System.out.println("Carbohydrates :"+this.carbohydrates);
	System.out.println("ChefName :"+this.chefName);
	System.out.println("Cost :"+this.cost);
	System.out.println("Effect :"+this.effect);
	System.out.println("Fats :"+this.fats);
	System.out.println("Healthy or Not :"+this.healthy);
	System.out.println("HotelName :"+this.hotelName);
	System.out.println("Ingredient :"+this.ingredient);
	System.out.println("Location :"+this.location);
	System.out.println("Quantity :"+this.quantity);
	System.out.println("Tasty or Not :"+this.tasty);
	System.out.println("Veg or Not :"+this.veg);
}
}
