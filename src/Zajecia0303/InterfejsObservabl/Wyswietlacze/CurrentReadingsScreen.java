package Zajecia0303.InterfejsObservabl.Wyswietlacze;

import java.util.Observable;
import java.util.Observer;

import Zajecia0303.InterfejsObservabl.StacjaPogodowa.WeatherData;

public class CurrentReadingsScreen implements Observer{
	private Observable weatherData;
	private float temperature;
	private int moisture;
	private float pressure;
	
	public CurrentReadingsScreen(Observable weatherData) {
		this.weatherData = weatherData;
		this.weatherData.addObserver(this);
	}
	
	public void printData() {
		System.out.println("Temperature - " + temperature);
		System.out.println("Moisture - " + moisture);
		System.out.println("Pressure - " + pressure);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			temperature = weatherData.getTemperature();
			pressure 	= weatherData.getPressure();
			moisture 	= weatherData.getMoisture();
		}
	}

}
