package com.tairovich.kata_7;

import java.util.Arrays;


public class MaxDiffEasy {

	public static int maxDiff(int[] lst) {

		int leng = lst.length;
		if(leng <=1) {
			return 0;
		}
		
		int min = Arrays.stream(lst).min().getAsInt();
		int max = Arrays.stream(lst).max().getAsInt();
		
		return max - min;
		
	}
}
