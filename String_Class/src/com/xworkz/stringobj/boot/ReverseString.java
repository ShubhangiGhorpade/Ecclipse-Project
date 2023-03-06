package com.xworkz.stringobj.boot;

public class ReverseString {

	public static void main(String[] args) {
		String caption = "Be Yourself";
		String rev = "";
		char ch[] = caption.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		System.out.println(rev);

	}

}
