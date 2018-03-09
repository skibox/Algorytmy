package PracaDomowa1003.zadanie4;

public class CukierPuder {
	private String name = "cukier";
	private boolean applied;
	private int amount;
	
	public CukierPuder(int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void add() {
		this.applied = true;
		this.amount += 100;
	}

	public String getName() {
		return name;
	}
	
}
