package com.tairovich.kata_7;

public class SimpleFibonacciStrings {

	public static String solve(int n) {
		String a = "1", b = "0";
		for (int i = 0; i < n; i++) {
			String c = b + a;
			a = b;
			b = c;
		}
		return b;
	}

	public static String solve2(int n) {

		if (n == 0)
			return "0";
		else if (n == 1) {
			return "01";
		}
		return solve2(n - 1) + solve(n - 2);
	}

}
