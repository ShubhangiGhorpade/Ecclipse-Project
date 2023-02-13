package com.java.technical.main;

public class Pattern {

	public static void main(String[] args) {
		/*
		 * int num = 3; for (int i = 0; i < num; i++) { System.out.print("* "); }
		 * System.out.println();
		 * 
		 * int n = 3; for (int j = 0; j < n; j++) { for (int k = 0; k < n; k++) {
		 * System.out.print("* "); } System.out.println(); }
		 */
		int s = 3;
		for (int l = 0; l < s; l++) {
			for (int m = 0; m < s; m++) {
				if (l == 0 && m == 0 || l == 1 && m == 0 || l == 1 && m == 1 || l == 2 && m == 0 || l == 2 && m == 1
						|| l == 2 && m == 2) {
					System.out.print("* ");
				} else {
					System.out.println(" ");
				}

			}

		}
	}
}
