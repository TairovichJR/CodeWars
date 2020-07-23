package com.tairovich.kata_7;

public class ConsecutiveSum {

	public static int consecutiveSum(int num) {
		 int count = 1;
		    for( int i = 2; i * i < num * 2; i++ ) {
		      if( i % 2 == 0 && num % i == i / 2 ) {
		    	  count++;
		      }
		      else if( i % 2 == 1 && num % i == 0) {
		    	  count++;
		      }
		    } 
	
		return count;
	}


}
