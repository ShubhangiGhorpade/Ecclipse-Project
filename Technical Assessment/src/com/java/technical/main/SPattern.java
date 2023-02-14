package com.java.technical.main;

public class SPattern {

	public static void main(String[] args) {
		int n = 20;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 && j == 1 || i == 1 && j == 2 || i == 1 && j == 3 || i == 1 && j == 4 || i == 2 && j == 1
						|| i == 3 && j == 1 || i == 4 && j == 1 || i == 4 && j == 2 || i == 4 && j == 3
						|| i == 4 && j == 4 || i == 5 && j == 4 || i == 6 && j == 4 || i == 7 && j == 4
						|| i == 7 && j == 1 || i == 7 && j == 2 || i == 7 && j == 3) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}

	}

}
