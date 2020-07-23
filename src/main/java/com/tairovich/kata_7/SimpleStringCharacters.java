package com.tairovich.kata_7;

import java.util.Arrays;

public class SimpleStringCharacters {

	public static int[] solve(String word) {

		int[] arr = new int[4];
		for (int i = 0; i < word.length(); i++) {

			if (Character.isAlphabetic(word.charAt(i))) {
				if (Character.isUpperCase(word.charAt(i)))
					arr[0] += 1;
				else
					arr[1] += 1;
			} else if (Character.isDigit(word.charAt(i))) {
				arr[2] += 1;
			} else {
				arr[3] += 1;
			}
		}

		return arr;

	}

	public static int[] solve2(String word) {

		int[] arr = new int[4];

		String[] str = word.split("");

		for (String s : str) {

			if (s.matches(".*[A-Z].*")) {
				arr[0]++;
			} else if (s.matches(".*[a-z].*")) {
				arr[1]++;
			} else if (s.matches(".*[0-9].*")) {
				arr[2]++;
			} else if (s.matches("[^a-zA-Z0-9]")) {
				arr[3]++;
			}
		}

		return arr;
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(solve2("*'&ABCDabcde12345")));
	}
}
