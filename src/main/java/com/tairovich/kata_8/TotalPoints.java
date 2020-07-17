package com.tairovich.kata_8;

public class TotalPoints {
	
	public static int points(String[] games) {
	
		int point = 0;

		for (int i = 0; i < games.length; i++) {
			String[] g = games[i].split(":");
			int our = Integer.parseInt(g[0]);
			int their = Integer.parseInt(g[1]);
			if (our > their) {
				point += 3;
			} else if (our == their) {
				point += 1;
			}

		}
		return point;
	}
}
