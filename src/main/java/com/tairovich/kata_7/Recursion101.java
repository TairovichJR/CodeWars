package com.tairovich.kata_7;


public class Recursion101 {

	public static int[] solve(int a, int b) {
		int[] res = { a, b };

		if (a == 0 || b == 0) {
			return res;
		} else if (a >= 2 * b) {
			return solve(a - 2 * b, b);
		} else if (b >= 2 * a) {
			return solve(a, b - 2 * a);
		}

		return res;
	}

}
