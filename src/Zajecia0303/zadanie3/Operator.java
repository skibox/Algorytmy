package Zajecia0303.zadanie3;

public interface Operator {
	public void registerObserver(Ambulance ambulance);
	public void removeObserver(Ambulance ambulance);
	public void notifyObservers();
}
