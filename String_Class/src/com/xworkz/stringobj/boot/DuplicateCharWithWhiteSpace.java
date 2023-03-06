package com.xworkz.stringobj.boot;

public class DuplicateCharWithWhiteSpace {

	public static void main(String[] args) {
		String quote = "mommommom";
		int length = quote.length();
		char[] ch = quote.toCharArray();
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println("duplicate value: " + ch[i]);
					break;
				}
			}
		} 
	}
}
