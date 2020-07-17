package com.tairovich.kata_8;

import java.util.regex.Pattern;

public class ValidateUsername {
	
	
	public static boolean validateUsr(String s) {
		Pattern p = Pattern.compile("[a-z0-9_]{4,16}");

		boolean match = p.matcher(s).matches();
		return match;
	}
}
