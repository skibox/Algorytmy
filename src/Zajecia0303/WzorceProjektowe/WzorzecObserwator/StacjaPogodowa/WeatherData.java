package Zajecia0303.WzorceProjektowe.WzorzecObserwator.StacjaPogodowa;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import Zajecia0303.WzorceProjektowe.WzorzecObserwator.Observer;
import Zajecia0303.WzorceProjektowe.WzorzecObserwator.Subject;

public class WeatherData implements Subject{
	private ArrayList<Observer> observers;
	private float temperature;
	private int moisture;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<>();
	}
	
	public void setReadings(float temperature, int moisture, float pressure) {
		this.temperature = temperature;
		this.moisture = moisture;
		this.pressure = pressure;
	}
	
	public void checkReadings() {
		if (temperature != fetchTemperature()	||
			moisture 	!= fetchMoisture() 		||
			pressure 	!= fetchPressure()	) {
			
			notifyObservers();
		}
	}

	private float fetchTemperature() {
		return ThreadLocalRandom.current().nextFloat();
	}

	private int fetchMoisture() {
		return ThreadLocalRandom.current().nextInt(100);
	}

	private float fetchPressure() {
		return 980 + ThreadLocalRandom.current().nextInt(35);
	}

	@Override
	public void registerObserver(Observer newObsever) {
		observers.add(newObsever);
		
	}

	@Override
	public void deleteObsever(Observer observerToDelete) {
		observers.remove(observerToDelete);
	}

	@Override
	public void notifyObservers() {
		for(int i = 0; i < observers.size(); i++) {
			observers.get(i).update(fetchTemperature(), fetchMoisture(), fetchPressure());
		}
	}

}
