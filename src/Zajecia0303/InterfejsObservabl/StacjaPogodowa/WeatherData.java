package Zajecia0303.InterfejsObservabl.StacjaPogodowa;

import java.util.Observable;


public class WeatherData extends Observable{
	private float temperature;
	private int moisture;
	private float pressure;
	
	public WeatherData() {
		
	}
	
	public WeatherData(float temperature, int moisture, float pressure) {
		setReadings(temperature, moisture, pressure);
	}
	
	public void setReadings(float temperature, int moisture, float pressure) {
		this.temperature = temperature;
		this.moisture = moisture;
		this.pressure = pressure;
	}
	
	public void checkReadings() {
		setChanged();
		notifyObservers();
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public int getMoisture() {
		return moisture;
	}

	public void setMoisture(int moisture) {
		this.moisture = moisture;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	
}
