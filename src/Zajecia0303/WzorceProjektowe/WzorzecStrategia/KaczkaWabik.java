package Zajecia0303.WzorceProjektowe.WzorzecStrategia;

import Zajecia0303.WzorceProjektowe.WzorzecStrategia.SposobyKwakania.NieKwakam;
import Zajecia0303.WzorceProjektowe.WzorzecStrategia.SposobyLatania.NieLatam;

public class KaczkaWabik extends Kaczka{
	public KaczkaWabik() {
		latanieInterfejs = new NieLatam();
		kwakanieInterfejs = new NieKwakam();
	}
	
	@Override
	public void wyswietl() {
		System.out.println("Wyświetlam kaczkę wabik");
	}
}
