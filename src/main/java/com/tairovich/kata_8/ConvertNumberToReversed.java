package com.tairovich.kata_8;

import java.util.ArrayList;

public class ConvertNumberToReversed {

	public static int[] digitize(long n) {
		long rev = n;
		long holder = 0;
		ArrayList<Integer> ar = new ArrayList<>();

		while (rev > 0) {
			holder = holder * 10;
			holder = (rev % 10);
			ar.add((int) holder);
			rev = rev / 10;
		}

		return ar.stream().mapToInt(Integer::intValue).toArray();
	}
}
