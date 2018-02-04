package Zajecia0402.CardShuffling;

public enum Figures {
	ACE(0),
	TWO(1),
	THREE(2),
	FOUR(3),
	FIVE(4),
	SIX(5),
	SEVEN(6),
	EIGHT(7),
	NINE(8),
	TEN(9),
	JACK(10),
	QUEEN(11),
	KING(12);
	
	private int value;

	private Figures(int value) {
		this.value = value;
	}

	private int getValue() {
		return value;
	}

	public static Figures getValueBasedOnInt(int value) {
		for (Figures figure : Figures.values()) {
			if (figure.getValue() == value)
				return figure;
		}
		return ACE;

	}
}
