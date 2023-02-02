package com.file.instanceVar;

public class Constructor {
public String name;
public int age;
public String address;
public String occupation;
public String birthPlace;

public Constructor() {
	System.out.println("No arg constructor");
}
public Constructor(String arg,int arg1,String arg2,String arg3,String arg4) {
	name=arg;
	age=arg1;
	address=arg2;
	occupation=arg3;
	birthPlace=arg4;
}
public Constructor(String arg,int arg1) {
	name=arg;
	age=arg1;
}
public Constructor(String arg,String arg1) {
	address=arg;
	occupation=arg1;
}
public Constructor(String arg,int arg1,String arg2) {
	address=arg;
	age=arg1;
	birthPlace=arg2;
}
public Constructor(String arg) {
	name=arg;
}
public void display() {
	System.out.println("Name :"+name);
	System.out.println("Age :"+age);
	System.out.println("Address :"+address);
	System.out.println("Occupation :"+occupation);
	System.out.println("Birth Place :"+birthPlace);
}
}
