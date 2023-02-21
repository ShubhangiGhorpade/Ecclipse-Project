package com.java.technical.main;

public class WhiteSpace {

	public static void main(String[] args) {
		String s = "S h u b h a n g i";
		String rev = "";
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ') {
				rev = rev + ch[i];
			}
		}
		System.out.println(rev);
	}

}
