package Zajecia0403.WzorzecFasada.KinoDomowe;

public class Projektor {
	boolean active;
	String source;
	int volume;
	
	public void turnOn(){
		active = true;
	}
	
	public void turnOff() {
		active = false;
	}
	
	public void setSource(String source) {
		this.source = source;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
}
