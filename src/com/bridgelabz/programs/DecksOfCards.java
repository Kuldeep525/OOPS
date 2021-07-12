package com.bridgelabz.programs;

import java.util.HashSet;
import java.util.Set;

public class DecksOfCards {
	
	public static void main(String[] args) {
		
	
		String[] suits = { "diamond" , "Hearts" , "Spades" , "Clubs"};
		String[] rank  = { "2" , "3", "4" , "5" , "6" , "7" , "8" , "9" , "10" , "Jack" , "King" , "Queen" , "Ace"};
		
		String[][] cardCombo = new String[4][13];
		Set<String> cards = new HashSet<String>();
		
		for (int i = 0 ; i < 4 ; i++) {
			for (int j = 0 ; j < 13 ; j++) {
				cardCombo[i][j] = suits[i] + rank[j];
				
			}
		}
		
		String[][] player = new String[4][9];
		int i ; 
		int j = 0 ; 
		int k = 0;
		int m = 0;
		int o = 0;
		int n = 1 ; 
		while(n <= 36) {
			int randomSuit = (int) Math.floor(Math.random() * 10) % 4 ;
			int randomRank = (int) Math.floor(Math.random() * 100) % 13 ;
			
			if (cards.add(cardCombo[randomSuit][randomRank])) {
				if (n % 4 == 0) {
					i = 0 ;
					player[i][j] = cardCombo[randomSuit][randomRank];
					j++;
					n++;
				} else if (n % 4 == 1) {
					i = 1; 
					player[i][k] = cardCombo[randomSuit][randomRank];
					k++;
					n++;
				} else if (n % 4 == 2) {
					i = 2 ;
					player[i][m] = cardCombo[randomSuit][randomRank];
					m++;
					n++;
				}
				else if (n % 4 == 3) {
					i = 3;
					player[i][o] = cardCombo[randomSuit][randomRank];
					o++;
					n++;
				}
				
			}
		}
	
			for (i= 0 ; i < 4 ; i++) {
				System.out.println("Player" + (i + 1) + " : ");
				for (j = 0 ; j < 9 ; j++ ) {
					System.out.println(player[i][j] + " ");
					
				}
				System.out.println();
			}
			
					
					
	}
			
		
		
}
	


