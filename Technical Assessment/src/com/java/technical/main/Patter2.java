package com.java.technical.main;

public class Patter2 {

	public static void main(String[] args) {
		int n = 10;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 && j == 1 || i == 2 && j == 2 ||
					i == 1 && j == 5 || i == 3 && j == 3 || 
					i == 2 && j == 4 || i == 4 && j == 2 || i == 5 && j == 1
					|| j == 4 && i == 4 || i == 5 && j == 5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}

	}
}
