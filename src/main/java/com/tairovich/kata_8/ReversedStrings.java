package com.tairovich.kata_8;

public class ReversedStrings {

	public static String solution(String str) {

		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}
}
