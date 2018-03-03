package Zajecia0303.zadanie3.kuby;

public class MyAmbulance implements Ambulance{
	Operator operator;
	int ourNumber;
	static int number;
	
	public MyAmbulance(Operator operator) {
		this.operator = operator;
		this.operator.registerObserver(this);
	}

	@Override
	public void update(String accident) {
		System.out.println("Jadę do " + accident);
	}
}
