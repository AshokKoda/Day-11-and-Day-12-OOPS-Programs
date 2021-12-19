package com.bridgelabz.oops;

import java.util.Random;
import java.util.Scanner;

public class UtilityOOPS {

	static Scanner scanner = new Scanner(System.in);
	
	/*
	 * Integer scanner from user input
	 */
	public static int integerScanner() {
		return scanner.nextInt();
	}
	
	/*
	 * String scanner from user input
	 */
	public static String stringScanner() {
		return scanner.next();
	}
	
	/*
	 * long scanner from user input
	 */
	public static long longScanner() {
		return scanner.nextLong();
	}
	
	/*
	 * string Single Word Scanner
	 */
	public static String stringSingleWordScanner() {
		return scanner.next();
	}
	
	/*
	 * Char scanner from user input
	 */
	public static char charScanner() {
		return scanner.next().charAt(0);
	}
	
	/*
	 * shuffles the card of deck
	 */
	public static String[] shuffleCardsDeck(String[] arr) {
		Random random = new Random();
		int player1, player2;
		String temp;
		
		for (int i = 0; i < 52; i++) {
			player1 = random.nextInt(51);
			player2 = random.nextInt(51);
			
			if(player1 != player2) {
				temp = arr[player1];
				arr[player1] = arr[player2];
				arr[player2] = temp;
			}
		}
		return arr;
	}
}
