package PracaDomowa1003.zadanie2.Gorzelnia.Dodatki;

import PracaDomowa1003.zadanie2.Gorzelnia.Moonshine;

public class ChokeberryJuice extends Dekorator{
	Moonshine moonshine;
	
	public ChokeberryJuice(Moonshine moonshine) {
		this.moonshine = moonshine;
	}
	
	@Override
	public String getName() {
		return moonshine.getName() + " aroniowa";
	}

	@Override
	public int alcoholVolumePercentage() {
		return moonshine.alcoholVolumePercentage();
	}

}
