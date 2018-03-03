package Zajecia0303.WzorceProjektowe.WzorzecObserwator.Wyswietlacze;

import Zajecia0303.WzorceProjektowe.WzorzecObserwator.Observer;
import Zajecia0303.WzorceProjektowe.WzorzecObserwator.Subject;

public class CurrentReadingsScreen implements Observer{
	private Subject weatherData;
	private float temperature;
	private int moisture;
	private float pressure;
	
	public CurrentReadingsScreen(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	public void printData() {
		System.out.println("Temperature - " + temperature);
		System.out.println("Moisture - " + moisture);
		System.out.println("Pressure - " + pressure);
	}
	
	@Override
	public void update(float temperature, int moisture, float pressure) {
		this.temperature = temperature;
		this.moisture = moisture;
		this.pressure = pressure;
	}

}
