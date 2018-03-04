package Zajecia0403.AdapterRadioFM;

public class AnalogToDigitalAdapter implements DigitalSignal{
	AnalogSignal radioFM;
	int[] payload;
	
	public AnalogToDigitalAdapter(AnalogSignal analogSignal) {
		radioFM = analogSignal;
		payload = new int[radioFM.getAnalog().length / 8];
	}
	
	@Override
	public int[] getDigital() {
		double[] temp = radioFM.getAnalog();

		for (int i = 0; i < temp.length / 8; i++) {
			byte[] oneByte = new byte[8];
			for (int j = 0; j < 8; j++) {
				if (temp[8 * i + j] > 1.0)
					oneByte[j] = 1;
				else
					oneByte[j] = 0;
			}
			for (int j = 0; j < oneByte.length; j++) {
				if (oneByte[j] != 0)
					payload[i] += Math.pow(2, j);
			}

		}

		return payload;
	}

	@Override
	public void setDigital(int[] digitData) {
		
	}

	@Override
	public void printDigital() {
		int[] payload = getDigital();
		for(int i : payload) {
			System.out.printf("%d\t", i);
		}
	}
	
}
