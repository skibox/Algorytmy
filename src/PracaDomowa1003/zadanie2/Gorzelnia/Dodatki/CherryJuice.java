package PracaDomowa1003.zadanie2.Gorzelnia.Dodatki;

import PracaDomowa1003.zadanie2.Gorzelnia.Moonshine;

public class CherryJuice extends Dekorator{
	Moonshine moonshine;

	public CherryJuice(Moonshine moonshine) {
		this.moonshine = moonshine;
	}
	
	@Override
	public String getName() {
		return moonshine.getName() + " wiśniowa";
	}

	@Override
	public int alcoholVolumePercentage() {
		return moonshine.alcoholVolumePercentage();
	}
	
	
}
