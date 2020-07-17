package com.tairovich.kata_8;

import java.util.Arrays;

public class ZywOo {
	
	
	public static int sumOfDifferences(int[] arr) {
		if (arr.length == 0 || arr.length == 1) {
			return 0;
		} else {
			Arrays.sort(arr);
			int diff = 0;
			for (int i = arr.length - 1; i > 0; i--) {
				diff += arr[i] - arr[i - 1];
			}
			return diff;
		}
	}
}
