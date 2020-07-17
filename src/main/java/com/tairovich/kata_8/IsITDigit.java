package com.tairovich.kata_8;

public class IsITDigit {
	public static boolean isDigit(String s) {
		if (s == null || s.isEmpty()) {
			return false;
		}

		if (s.length() == 1 && Character.isDigit(s.charAt(0))) {
			return true;
		}

		return false;
	}

	public static boolean isDigits(String s) {
		return s.matches("[0-9]");
	}
}
