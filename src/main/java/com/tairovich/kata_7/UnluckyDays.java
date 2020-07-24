package com.tairovich.kata_7;

import java.util.Calendar;

public class UnluckyDays {

	public static int unluckyDays(int year) {
		
		int counter = 0;
		Calendar cal = Calendar.getInstance();
		
		for(int i =0; i < 12; i++) {
			cal.set(year, i, 13, 0, 0);
			if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
				counter++;
			}
			
		}	
		
		return counter;
	}
	public static void main(String[] args) {
		
		System.out.println(unluckyDays(2015));

		
	}
}
