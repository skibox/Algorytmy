package PracaDomowa1003.zadanie4;

public class Koko {
	private String name = "koko";
	private boolean applied;
	private int amount;
	
	public Koko(int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}
	
	public void add() {
		this.applied = true;
	}
	
}
