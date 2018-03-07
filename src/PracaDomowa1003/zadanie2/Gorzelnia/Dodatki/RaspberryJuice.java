package PracaDomowa1003.zadanie2.Gorzelnia.Dodatki;

import PracaDomowa1003.zadanie2.Gorzelnia.Moonshine;

public class RaspberryJuice extends Dekorator{
	Moonshine moonshine;

	public RaspberryJuice(Moonshine moonshine) {
		this.moonshine = moonshine;
	}
	
	@Override
	public String getName() {
		return moonshine.getName() + " malinowa";
	}

	@Override
	public int alcoholVolumePercentage() {
		return moonshine.alcoholVolumePercentage();
	}
	
}
