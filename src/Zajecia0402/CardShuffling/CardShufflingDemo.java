package Zajecia0402.CardShuffling;

public class CardShufflingDemo {
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.printAll();
		deck.shuffleCards();
		System.out.println("=================================");
		deck.printAll();
	}
}
