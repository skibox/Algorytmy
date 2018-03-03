package Zajecia0303.zadanie3.kuby;

public class Demo {
	public static void main(String[] args) {
		OperatorAdam operatorAdam = new OperatorAdam();
		
		MyAmbulance amb1 = new MyAmbulance(operatorAdam);
		MyAmbulance amb2 = new MyAmbulance(operatorAdam);
		MyAmbulance amb3 = new MyAmbulance(operatorAdam);
		
		operatorAdam.notifyObservers("Wypadek samochodowy");
		operatorAdam.notifyObservers("Przejechanie walcem");
		operatorAdam.notifyObservers(accident);
	}
}
