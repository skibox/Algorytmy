package Lista5.zadanie14;

public class Box{
	private int itemCounter;
	private int weightInBox;
	
	public int getWeightInBox() {
		return weightInBox;
	}

	public void setWeightInBox(int weightInBox) {
		this.weightInBox = weightInBox;
	}

	public int getItemCounter() {
		return itemCounter;
	}

	public void setItemCounter(int itemCounter) {
		this.itemCounter = itemCounter;
	}

	public Box() {
		this.itemCounter = 0;
		this.weightInBox = 0;
	}
	
	public void addWeight(int weight) {
		this.weightInBox += weight;
	}
	

	
	
}
