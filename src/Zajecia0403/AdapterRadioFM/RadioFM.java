package Zajecia0403.AdapterRadioFM;

import java.util.Random;

public class RadioFM implements AnalogSignal {

	private double[] analog;
	
	public RadioFM(int noSamples) {
		Random random = new Random();
		analog = new double[noSamples];
		

		analog = random.doubles(noSamples, 0.0, 2.0).toArray();
	}
	
	@Override
	public double[] getAnalog() {
		return analog;
	}

	@Override
	public void setAnalog(double[] analog) {
		this.analog = analog;
	}

	@Override
	public void printAnalog() {
		for (double i : analog) {
			System.out.printf("%f\t", i);
		}
	}

}
