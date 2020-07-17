package com.tairovich.kata_8;

public class ExpressionsMatter {
	
	public static int expressionsMatter(int a, int b, int c) {

		return Math.max(Math.max(a + b + c, a * b * c), Math.max((a + b) * c, a * (b + c)));
	}
}
