package com.file.instanceVar;
//15
public class Biryani {
	
public String type;
public int cost;
public String chefName;
public String location;
public String hotel;
public int quantity;
public boolean health;
public String benefit;
public boolean veg;
public String ingredient;
public boolean tasty;
public int calories;
public String effect;
public int fats;
public int carbohydrates;

public Biryani() {
	System.out.println("No arg constructor");
}
public Biryani(boolean arg) {
	veg=true;
}
public Biryani(String arg,boolean arg1) {
	type=arg;
	tasty=arg1;
}
public Biryani(boolean arg,boolean arg1) {
	veg=arg;
	tasty=arg1;
}
public Biryani(int arg,int arg1) {
	fats=arg;
	carbohydrates=arg1;
}
public Biryani(String arg,boolean arg1,boolean arg2) {
	type=arg;
	tasty=arg1;
	veg=arg2;
}
public Biryani(int arg) {
	cost=arg;
}
public Biryani(int arg,int arg1,String arg2) {
	cost=arg;
	quantity=arg1;
	type=arg2;
}
public Biryani(boolean arg,int arg1) {
	tasty=arg;
	cost=arg1;
}
public Biryani(String arg) {
	type=arg;
}
public Biryani(boolean arg,int arg1,String arg2) {
	veg=arg;
	cost=arg1;
	type=arg2;
}
public Biryani(boolean arg,boolean arg1,String arg2) {
	veg=arg;
	tasty=arg1;
	type=arg2;
}
public Biryani(int arg,String arg1) {
	cost=arg;
	type=arg1;
}
public Biryani(int arg,boolean arg1) {
	cost=arg;
	tasty=arg1;
}
public Biryani(int arg,int arg1,boolean arg2) {
	cost=arg;
	quantity=arg1;
	veg=arg2;
}
public void display() {
	System.out.println("type :"+type);
	System.out.println("cost :"+cost);
	System.out.println("quantity :"+quantity);
    System.out.println("veg :"+veg);
    System.out.println("tasty :"+tasty);
    System.out.println("chefName :"+chefName);
    System.out.println("location :"+location);
    System.out.println("hotel :"+hotel);
    System.out.println("health :"+health);
    System.out.println("benefit :"+benefit);
    System.out.println("ingredient :"+ingredient);
    System.out.println("tasty :"+tasty);
    System.out.println("calories :"+calories);
    System.out.println("fats :"+fats);
    System.out.println("carbohydrates :"+carbohydrates);
}
}
