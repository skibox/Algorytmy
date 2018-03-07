package PracaDomowa1003.zadanie2.Gorzelnia.Dodatki;

import PracaDomowa1003.zadanie2.Gorzelnia.Moonshine;

public class PureBoringWater extends Dekorator{
	Moonshine moonshine;
	
	public PureBoringWater(Moonshine moonshine) {
		this.moonshine = moonshine;
	}

	@Override
	public String getName() {
		return this.moonshine.getName();
	}

	@Override
	public int alcoholVolumePercentage() {
		return this.moonshine.alcoholVolumePercentage() - 8;
	}
	
	
	
}
