package com.tairovich.kata_7;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConsecutiveLetters {

	public static boolean solve(String s){
		char[] c =  s.toCharArray();
		Arrays.sort(c);
		
		boolean flag = true;
		
		for(int i = 0; i<c.length-1; i++) {
			int first = c[i];
			int second = c[i+1];
			if((first+1)  != second) {
				flag = false;
				break;
			}
		}
		return flag;
    }
	
	
	public static boolean solve2(String s) {
        return "abcdefghijklmnopqrstuvwxyz".contains(Stream.of(s.split("")).sorted().collect(Collectors.joining()));
    }
	
	public static boolean solve3(String s) {
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		
		String sorted = String.valueOf(chars);
		
		return alphabet.contains(sorted);

    }
	
	
}
