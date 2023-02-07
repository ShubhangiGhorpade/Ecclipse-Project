package com.java.technical.main;

public class PatternV {

	public static void main(String[] args) {
		int num = 6;
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i == j || i + j == num + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println("");
		}
	}

}
