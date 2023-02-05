package com.java.technical.main;

public class PalindromeString {

	public static void main(String[] args) {
		String s="shubhangi";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not");
		
		}

	}

}
