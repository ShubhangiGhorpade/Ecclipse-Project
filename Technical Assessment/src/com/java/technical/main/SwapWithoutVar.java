package com.java.technical.main;

public class SwapWithoutVar {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a);
		System.out.println(b);

	}

}