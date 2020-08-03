package com.tairovich.kata_7;


public class SimpleStringReversal {

	public static String solve(String s) {
	
		String[] arr = s.split(" ");
		String reversed = new StringBuilder(s.replace(" ", "")).reverse().toString();
		String result = "";
		for(String str : arr) {
			result += reversed.substring(0,str.length()) + " ";
			reversed = reversed.substring(str.length());
		}
		
		return result.trim(); 		
	}
	
}
