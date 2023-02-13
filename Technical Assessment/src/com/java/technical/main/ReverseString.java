package com.java.technical.main;

public class ReverseString {
//	using method	
	public static String init(String name, String rev) {
		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		String rev = ReverseString.init("Shubhangi", "");
		System.out.println("Reversed Name: " + rev);

// using main method
		/* * String s = "shubhangi";
		 *  String rev = ""; 
		 *  for (int i = s.length() - 1; i >= 0; i--) {
		 *   rev = rev + s.charAt(i); 
		 *   System.out.println(rev); }
		 * System.out.println("Reversed s: " + rev);*/
	}

}
