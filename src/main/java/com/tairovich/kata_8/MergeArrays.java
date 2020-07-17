package com.tairovich.kata_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArrays {
	public static int[] mergeArrays(int[] first, int[] second) {

		if (first.length == 0 && second.length == 0) {
			return new int[] {};
		}
		int[] res = new int[first.length + second.length];
		int count = 0;
		for (int i = 0; i < first.length; i++) {
			res[i] = first[i];
			count++;
		}
		for (int i = 0; i < second.length; i++) {
			res[count++] = second[i];
		}

		Arrays.sort(res);
		List<Integer> l = new ArrayList<>();

		for (int i = 0; i < res.length - 1; i++) {
			if (res[i] != res[i + 1]) {
				l.add(res[i]);
			}
		}
		if (l.get(l.size() - 1) != res[res.length - 1]) {
			l.add(res[res.length - 1]);
		}

		int[] ints = new int[l.size()];
		for (int i = 0; i < l.size(); i++) {
			ints[i] = l.get(i);
		}

		return ints;
	}
}
