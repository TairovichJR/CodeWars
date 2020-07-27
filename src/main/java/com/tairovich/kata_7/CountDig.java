package com.tairovich.kata_7;

public class CountDig {

	public static int nbDig(int n, int d) {
		int count =0;
		for(int i =0; i <= n; i++) {
			int sqr = i * i;
			String[] strN = String.valueOf(sqr).split(""); //[1,2,1]
			for(int j =0; j < strN.length; j++) {
				if(Integer.valueOf(strN[j]) == d) {
					count++;
				}
			}
		}
		return count;
	}
	
	
}
