package com.java.technical.main;

public class VowelCount {

	public static void main(String[] args) {
		String s = "  shubhangi";
		int count = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
				System.out.println(count);

			}

		}
	}
}
