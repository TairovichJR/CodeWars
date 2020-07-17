package com.tairovich.kata_8;

public class AbbreviateTwoWords {
	public static String abbrevName(String name) {

		String[] s = name.split(" ");
		return s[0].substring(0, 1).toUpperCase() + "." + s[1].substring(0, 1).toUpperCase();
	}
}
