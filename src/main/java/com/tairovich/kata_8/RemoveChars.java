package com.tairovich.kata_8;

public class RemoveChars {

	public static String remove(String str) {

		if (str.length() > 2) {
			return str.substring(1, str.length() - 1);
		}

		return str;
	}
}
