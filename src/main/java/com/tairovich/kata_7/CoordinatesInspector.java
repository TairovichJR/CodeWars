package com.tairovich.kata_7;

import java.awt.geom.Point2D;

public class CoordinatesInspector {

	public Point2D coordinates(Double degrees, Double radius) {

		Double rad =radius * Math.cos(Math.toRadians(degrees));
		Double ang =radius * Math.sin( Math.toRadians(degrees));

		rad = Double.parseDouble(String.format("%.10f", rad));
		ang = Double.parseDouble(String.format("%.10f", ang));

		return new Point2D.Double(rad, ang);

	}

	public static void main(String[] args) {

		
	}
}
