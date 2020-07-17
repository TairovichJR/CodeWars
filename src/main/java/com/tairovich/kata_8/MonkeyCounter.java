package com.tairovich.kata_8;

public class MonkeyCounter {
	public static int[] monkeyCount(final int n) {

		int[] ints = new int[n];
		for (int i = 0; i < ints.length; i++) {
			ints[i] = i + 1;
		}

		return ints;
	}
}
