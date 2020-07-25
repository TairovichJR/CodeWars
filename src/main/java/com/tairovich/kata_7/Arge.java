package com.tairovich.kata_7;

public class Arge {

	public static int nbYear(int p0, double percent, int aug, int p) {

		int count = 1;
		double total = p0;
		
		while(true) {
			double yearlyIncrease = (total * (percent * 0.01)) + aug;
			total += yearlyIncrease;
			if(total >= p) {
				break;
			}else {
				count++;
			}	
		}
		return count;	
    }
	
	public static int nbYear2(int p0, double percent, int aug, int p) {

		int count = 0;
		while(p0 < p) {
			p0 += p0 * percent/100 + aug;
			count++;
		}
		return count;
		
    }

}
