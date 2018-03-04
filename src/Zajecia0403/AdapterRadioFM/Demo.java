package Zajecia0403.AdapterRadioFM;

public class Demo {
	public static void main(String[] args) {
		AnalogSignal analogSignal = new RadioFM(256);
		DigitalSignal DAC = new AnalogToDigitalAdapter(analogSignal);
		
		analogSignal.printAnalog();
		System.out.println();
		DAC.printDigital();
	}
}
