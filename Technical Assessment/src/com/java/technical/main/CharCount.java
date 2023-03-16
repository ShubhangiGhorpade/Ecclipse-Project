 package com.java.technical.main;

import java.util.Scanner;

public class CharCount {

	public static void main(String[] args) {
		System.out.println("Enter the String:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		char ch[] = name.toCharArray();
		int count = 0;
		int countSpace = 0;
		for (int i = 0; i < ch.length; i++) {
			{
				if (ch[i] == ' ') {
					countSpace += 1;
				} else {
					count += 1;
				}
			}
		}
		System.out.println("No of char: " + count);
		System.out.println("No of space: " + countSpace);
	}

}
