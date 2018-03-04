package Zajecia0403.AdapterRadioFM;

public class DigitalRadio implements DigitalSignal{
	private int[] digits;
	
	public DigitalRadio(int signalLength) {
		digits = new int[signalLength];
	}
	
	@Override
	public int[] getDigital() {
		return digits;
	}

	@Override
	public void setDigital(int[] digitData) {
		this.digits = digitData;
	}

	@Override
	public void printDigital() {
		
	}

}
