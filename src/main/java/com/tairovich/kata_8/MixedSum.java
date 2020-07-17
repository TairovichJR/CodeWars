package com.tairovich.kata_8;

import java.util.List;

public class MixedSum {
	public int sum(List<?> mixed) {

		int sum = 0;
		for (Object element : mixed) {

			if (element instanceof Integer) {
				sum += (Integer) element;
			} else if (element instanceof String) {
				sum += Integer.parseInt((String) element);
			}
		}

		return sum;
	}
}
