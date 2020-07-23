package com.tairovich.kata_7;

import java.util.Arrays;
import java.util.LinkedList;

public class SimpleRemoveDuplicates {

	public static int[] solve(int[] arr) {
		LinkedList<Integer> l = new LinkedList<>();
		for (int i = arr.length - 1; i >= 0; i--) {
		      if (!l.contains(arr[i])) {
		    	  l.addFirst(arr[i]);
		      }
		    }
		return l.stream().mapToInt(i -> i).toArray();
	}
	

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(solve(new int[] {1,2,3,2,2,3,1})));
	
	}
}