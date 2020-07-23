package com.tairovich.kata_7;

public class FixStringCase {

	public static String solve(final String str) {

		int leng = str.length();
		int upper = 0;
		int lower = 0;
		for(int i = 0; i < leng; i++) {
			
			if(Character.isUpperCase(str.charAt(i))) {
				upper++;
			}else {
				lower++;
			}
		}
		
		if(upper > lower) {
			return str.toUpperCase();
		}
	
		return str.toLowerCase(); 
	}
	
}
