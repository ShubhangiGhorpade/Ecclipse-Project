package com.file.instanceVar;
//10
public class FrenchFry {
public String type;
public String chefName;
public String ingredient;
public int cost;
public String shape;
public String location;
public String hotelName;
public int length;
public boolean good;
public int weight;

public FrenchFry() {
	System.out.println("No arg constructor");
}

public FrenchFry(String arg1) {
	type=arg1;
}
public FrenchFry(boolean arg1) {
	good=arg1;
}
public FrenchFry(int arg1) {
	cost=arg1;
}
public FrenchFry(String arg,String arg1) {
	hotelName=arg;
	location=arg1;
}
public FrenchFry(String arg,boolean arg1) {
	chefName=arg;
	good=arg1;
}
public FrenchFry(String arg,boolean arg1,int arg2) {
	type=arg;
	good=arg1;
	cost=arg2;
}
public FrenchFry(boolean arg,int arg1) {
	good=arg;
	cost=arg1;
}
public FrenchFry(String arg,String arg1,boolean arg2,int arg3) {
	ingredient=arg;
	type=arg1;
	good=arg2;
	cost=arg3;
}
public FrenchFry(int arg,boolean arg1) {
	cost=arg;
	good=arg1;
}
public void display() {
	System.out.println("Type :"+type);
	System.out.println("chefName :"+chefName);
	System.out.println("ingredient :"+ingredient);
	System.out.println("cost :"+cost);
	System.out.println("shape :"+shape);
	System.out.println("location :"+location);
	System.out.println("hotelName :"+hotelName);
	System.out.println("length :"+length);
	System.out.println("good :"+good);
	System.out.println("weight :"+weight);
	
}
}
