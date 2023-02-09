package com.java.technical.main;

public class ReverseString {

	public static void main(String[] args) {
		String s = "shubhangi";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
			System.out.println(rev);
		}
		System.out.println("Reversed s: "+rev);
	}

}
