package Zajecia0303.zadanie3.kuby;

public interface Operator {
	void registerObserver(Ambulance ambulance);
	void removeObserver(Ambulance ambulance);
	void notifyObservers(String accident);
}
