package Zajecia0402.CardShuffling;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> deck = new ArrayList<>();

	public Deck() {
		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < 4; j++) {
				Card card = new Card(Colors.getValueBasedOnInt(j), Figures.getValueBasedOnInt(i));
				deck.add(card);
			}
		}
	}
	
	public void printAll() {
		for(Card card : deck) {
			System.out.println(card);
		}
	}
	
	public void shuffleCards() {
		Collections.shuffle(deck);
	}
}
