package com.tairovich.kata_7;

public class Movie {

	 public static int movie(int card, int ticket, double perc) {
	       
		 int count = 0;
		 int systemA = 0;
		 double systemB = card;
		 
		 while(Math.ceil(systemB) >= systemA) {
			 
			 count++;
			 systemA += ticket;
			 systemB += ticket * (Math.pow(perc, count));
			 
		 }
		
		 return count;
		  
	 }
	 public static void main(String[] args) {
		
		 System.out.println(movie(500, 15, 0.90));
	}
}
