package com.tairovich.kata_7;

public class FirstMultiplesOfN {

	public static int[] multiples(int m, int n) {
		
		int[] mults = new int[m];
		int count = 1;
	
		for(int i =0; i < mults.length; i++) {
			mults[i] = count * n;
			count++;
		}
		
		return mults;
	}
	
}
