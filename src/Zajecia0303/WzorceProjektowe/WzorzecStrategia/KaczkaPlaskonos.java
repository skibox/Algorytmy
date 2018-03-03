package Zajecia0303.WzorceProjektowe.WzorzecStrategia;

import Zajecia0303.WzorceProjektowe.WzorzecStrategia.SposobyKwakania.KwakamBoUmiem;
import Zajecia0303.WzorceProjektowe.WzorzecStrategia.SposobyLatania.LatamBoMamSkrzydla;

public class KaczkaPlaskonos extends Kaczka {
	public KaczkaPlaskonos() {
		latanieInterfejs = new LatamBoMamSkrzydla();
		kwakanieInterfejs = new KwakamBoUmiem();
	}

	@Override
	public void wyswietl() {
		System.out.println("Wyświetlam kaczkę płaskonos");
	}
}
