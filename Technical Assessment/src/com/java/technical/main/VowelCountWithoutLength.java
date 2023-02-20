package com.java.technical.main;

import java.util.Scanner;

public class VowelCountWithoutLength {

	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		char ch[] = name.toCharArray();
		int vowelCount = 0;
		int constCount = 0;
		for (int i = ch.length - 1; i >= 0; i--) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				vowelCount += 1;
				System.out.println("vowel: " + ch[i]);

			} else {
				constCount += 1;
				System.out.println("Consonants: " + ch[i]);
			}
		}
		System.out.println("vowelCount: " + vowelCount);
		System.out.println("constCount: " + constCount);
	}

}
