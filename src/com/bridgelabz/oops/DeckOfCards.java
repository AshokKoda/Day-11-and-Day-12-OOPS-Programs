package com.bridgelabz.oops;

public class DeckOfCards {

	public static void main(String[] args) {
		
		String[] cards = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		String[] cardsArray = new String[52];
		
		int start = 0, end = 12, j1 = 0;
		
		// for combination of cards and ranks
		for (int i = 0; i < 4; i++) {
			for (int j = start; j <= end; j++) {
				cardsArray[j] = cards[i] + " " + ranks[j1];
				j1++;
			}
			j1 = 0;
			start = end + 1;
			end += 13;
		}
		
		//Printing all cards
//		for (int i = 0; i < cardsArray.length; i++) {
//			System.out.print(cardsArray[i] + " ");
//		}
		
		//shuffle all the cards
		UtilityOOPS.shuffleCardsDeck(cardsArray);
		System.out.println();
		
		//printing cards for 4 players
		int j2 = 0;
		for (int i = 0; i < 4; i++) {
			System.out.print("For Player " + i + ": \n");
			for (int j = 0; j < 9; j++) {

				System.out.print(cardsArray[j2] + "-->");
				j2++;
			}
			System.out.println();
		}

	}

}
