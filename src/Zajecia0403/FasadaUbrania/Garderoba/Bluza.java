package Zajecia0403.FasadaUbrania.Garderoba;

public class Bluza implements Cloth{
	private boolean worn;
	
	public void wear() {
		worn = true;
	}
	
	public void takeOff() {
		worn = false;
	}
	@Override
	public boolean isWorn() {
		return worn;
	}
}
