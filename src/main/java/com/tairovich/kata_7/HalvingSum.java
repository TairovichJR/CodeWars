package com.tairovich.kata_7;

public class HalvingSum {

	public static int halvingSum(int n) {

		int sum = n;
		while(n > 0) {		
			n = n / 2;
			sum += n;
		}
		
		return sum;
	}
}
