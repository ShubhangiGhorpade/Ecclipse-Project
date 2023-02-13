package com.java.technical.main;

public class FactoriaUsingMethod {

	public static int init(int n, int fact) {
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {

		int fact = FactoriaUsingMethod.init(5, 1);
		System.out.println(fact);
	}

}
