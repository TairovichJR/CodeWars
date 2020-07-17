package com.tairovich.kata_8;

public class TipCalculator {
	public static Integer calculateTip(double amount, String rating) {

		if (rating.equalsIgnoreCase("terrible")) {
			return 0;
		} else if (rating.equalsIgnoreCase("poor")) {
			double k = amount * 0.05;
			return (int) Math.ceil(k);
		} else if (rating.equalsIgnoreCase("good")) {
			double k = amount * 0.1;
			return (int) Math.ceil(k);
		} else if (rating.equalsIgnoreCase("great")) {
			double k = amount * 0.15;
			return (int) Math.ceil(k);
		} else if (rating.equalsIgnoreCase("excellent")) {
			double k = amount * 0.2;
			return (int) Math.ceil(k);
		}
		return null;
	}
}
