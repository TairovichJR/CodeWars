package com.tairovich.kata_8;

public class StringUtils {

	public static String toAlternativeString(String string) {
		int leng = string.length();
		StringBuffer sb = new StringBuffer(string);

		for (int i = 0; i < leng; i++) {

			Character c = string.charAt(i);

			if (Character.isLowerCase(c)) {
				sb.replace(i, i + 1, Character.toUpperCase(c) + "");
			} else {
				sb.replace(i, i + 1, Character.toLowerCase(c) + "");
			}
		}
		return sb.toString();
	}
}
