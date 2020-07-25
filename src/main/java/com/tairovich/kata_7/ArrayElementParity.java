package com.tairovich.kata_7;

import java.util.Arrays;

public class ArrayElementParity {

	public static int solve(int[] arr) {

		boolean flag = false;
		
		for(int i =0; i < arr.length; i++) {
			
			flag = false;
			for(int j = 0; j < arr.length; j++) {
				
				if( i != j && arr[i] + arr[j] == 0) {
					flag = true;
				}
			}
			if(!flag) {
				return arr[i];
			}
		}
		return -1;
	}
	
	public static int solve2(int[] arr) {
		
		int result = Arrays.stream(arr).distinct().sum();
		
		return result;
	}
	

}
