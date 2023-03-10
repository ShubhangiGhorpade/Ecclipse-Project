package com.java.technical.main;

public class FibonacciSeq {
	// recursion mean fib(n-1)+fib(n-2);
	static int fib(int n) {
		if (n <= 1) {
			return n;
		}
		return fib(n - 1) + fib(n - 2) + fib(n - 3);
	}

	public static void main(String[] args) {
		int N = 10;
		for (int i = 0; i < N; i++) {
			System.out.println(fib(i));
		}
	}
}
