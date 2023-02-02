package com.file.instanceVar;
//12
public class Frame {
public String type;
public int cost;
public String colour;
public String size;
public String event;
public String material;
public int length ;
public int width ;
public int height ;
public int copies ;
public int date ;
public String day ;

public Frame(String type,int cost,String colour,String size,String event,String material,int length,
		int width,int height,int copies,int date,String day) {
	this.type=type;
	this.cost=cost;
	this.colour=colour;
	this.size=size;
	this.event=event;
	this.material=material;
	this.length=length;
	this.width=width;
	this.height=height;
	this.copies=copies;
	this.date=date;
	this.day=day;
}
public void show() {
	System.out.println("Type :"+type);
	System.out.println("Cost :"+cost);
	System.out.println("Colour :"+colour);
	System.out.println("Size :"+size);
	System.out.println("Event :"+event);
	System.out.println("Material :"+material);
	System.out.println("Length :"+length);
	System.out.println("Width :"+width);
	System.out.println("Height :"+height);
	System.out.println("Copies :"+copies);
	System.out.println("Date :"+date);
	System.out.println("Day :"+day);
}
}
