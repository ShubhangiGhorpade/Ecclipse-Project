package com.xworkz.inheritance.objRunner;

public class ABC {
 void get (long a) {
	 System.out.println("Inside long");
 }
 void get (double f) {
	 System.out.println("Inside double");
 }
 
 public static void main(String[] args) {

	 new ABC().get(10);
}
 
		
	
	
}
