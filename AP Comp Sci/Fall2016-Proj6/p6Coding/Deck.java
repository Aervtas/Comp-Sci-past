package p6Coding;

import java.util.ArrayList;

public class Deck {

	//YOU NEED TO USE THIS ARRAYLIST<CARD> TO HOLD THE DECK
	//  YOU CANNOT USE REGULAR ARRAYS IN THIS CLASS OTHER THAN
	//  IN THE DEAL METHOD, WHICH NEEDS TO RETURN AN ARRAY
	
	private ArrayList<Card> cards;

	public Deck() {
		throw new RuntimeException("You need to implement this...");
	}

	public Deck(Deck other) {
		throw new RuntimeException("You need to implement this...");
	}

	public Card getCardAt(int position) {
		throw new RuntimeException("You need to implement this...");
	}

	public int getNumCards() {
		throw new RuntimeException("You need to implement this...");
	}


	public Card[] deal(int numCards) {
		throw new RuntimeException("You need to implement this...");
	}


	public void cut(int position) {
		throw new RuntimeException("You need to implement this...");
	}
	
	public void shuffle() {
		throw new RuntimeException("Challenge problem...");
	}
	

}
