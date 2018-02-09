package Projekty.RockPaperScissors;

public enum FigureType {
	ROCK('k'),
	PAPER('p'),
	SCISSORS('n'),
	QUIT('q');
	
	private char state;

	private FigureType(char state) {
		this.state = state; }
	
	private FigureType() {
		
	}
	
	public char getState() {
		return state;
	}
	
	public static FigureType getValueBasedOnChar(char state) {
		for(FigureType figure : FigureType.values()) {
			if(figure.getState() == state)
				return figure;
		}
		return ROCK;
	}
}
