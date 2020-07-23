package com.tairovich.kata_8;

public class CenturyFromYear {
	
	public static int century(int number) {

		if (number <= 100) {
			return 1;
		} else if (number % 100 == 0) {
			return number / 100;
		} else {
			return (number / 100) + 1;
		}

	}
	
	public static void main(String[] args) {
		
		
		
		System.out.println(100/7);
	}
}
