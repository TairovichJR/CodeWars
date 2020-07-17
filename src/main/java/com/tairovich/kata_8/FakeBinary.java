package com.tairovich.kata_8;

import java.util.stream.Collectors;

public class FakeBinary {

	public static String fakeBin(String numberString) {
		String belowFive = "[0-4]";
		String aboveFive = "[5-9]";
		
        return numberString.replaceAll(belowFive, "0").replaceAll(aboveFive, "1");
    }
	

	public static String fakeBin1(String numberString) {
		
		return numberString.chars().mapToObj(c -> c < '5' ? "0" : "1").collect(Collectors.joining());
    }
	
	
	
	
}
