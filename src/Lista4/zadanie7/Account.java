package Lista4.zadanie7;


public class Account {
	private String ID;
	private String name;
	private int balance = 0;

	public Account(String ID, String name) {
		setID(ID);
		setName(name);
	}

	public Account(String ID, String name, int balance) {
		setID(ID);
		setName(name);
		setBalance(balance);
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int credit(int amount) {
		setBalance(getBalance() + amount);
		return getBalance();
	}

	public int debit(int amount) {
		if (amount <= getBalance())
			setBalance(getBalance() - amount);
		else
			System.err.println("Amount exceeded balance");

		return getBalance();
	}

	public int transferTo(Account another, int amount) {
		if (amount <= getBalance()) {
			debit(amount);
			another.setBalance(another.getBalance() + amount);
		}
			
		else System.err.println("Amount exceeded balance");
	
		return getBalance();
	}

	@Override
	public String toString() {
		return "Account[id = " + getID() + ", name = " + getName() + ", balance = " + getBalance() + "]";
	}
}
