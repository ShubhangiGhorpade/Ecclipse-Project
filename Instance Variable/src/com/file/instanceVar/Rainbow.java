package com.file.instanceVar;
//7
public class Rainbow {
public String colour;
public boolean visible ;
public int noOfColour;
public boolean seasonal; 
public boolean change;
public String colour1;
public String colour2;

public Rainbow(String colour,boolean visible,boolean seasonal,String colour1,
		String colour2, boolean change, int noOfColour) {
	this.colour=colour;
    this.visible=visible;
    this.noOfColour=noOfColour;
    this.seasonal=seasonal;
    this.change=change;
    this.colour1=colour1;
    this.colour2=colour2;
}
public void show() {
	System.out.println("Colour :"+this.colour);
	System.out.println("Visible :"+this.visible);
	System.out.println("No Of Colour :"+this.noOfColour);
	System.out.println("Seasonal :"+this.seasonal);
	System.out.println("Change :"+this.change);
	System.out.println("Colour1 :"+this.colour1);
	System.out.println("Colour2 :"+this.colour2);
}
}
