package com.java.technical.main;

import java.util.Scanner;

public class SpaceCount {

	public static void main(String[] args) {
		System.out.println("Enter String:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		char ch[] = name.toCharArray();
		int count = 0;
//without length
		for (int i = ch.length - 1; i >= 0; i--) {
			if (ch[i] == ' ') {
				count += 1;
			}
		}
		System.out.println(count);
//with length()
		for (int i = 0; i < name.length(); i++) {
			if (ch[i] == ' ') {
				count += 1;
			}
		}
		System.out.println(count);
	}

}
