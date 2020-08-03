package com.tairovich.kata_7;

public class SimpleStringReversalII {

	public static String solve(String s, int a, int b){
        
		String front = s.substring(0, a);
		String reversedMiddle = "";
		
		if(b >= s.length()) {
			reversedMiddle = new StringBuilder(s.substring(a)).reverse().toString();
		}else {
			reversedMiddle = new StringBuilder(s.substring(a,b+1)).reverse().toString() + s.substring(b+1);
		}
		return front + reversedMiddle;
    }
	
	public static void main(String[] args) {
		
		
		System.out.println(solve("codingIsFun", 2, 100));
		System.out.println("conuFsIgnid");
	}
	
}
