package com.tairovich.kata_7;

public class NthPowerRulesThemAll {

	public static int modifiedSum(int[] array, int power) {

		int sum = 0;
		for (int n : array) {
			sum += Math.pow(n, power) - n;

		}

		return sum;
	}

	public static void main(String[] args) {
		System.out.println(modifiedSum(new int[] { 1, 2, 3 }, 3));
	}
}
