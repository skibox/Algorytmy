package Zajecia0303.WzorceProjektowe.WzorzecStrategia;

import Zajecia0303.WzorceProjektowe.WzorzecStrategia.SposobyKwakania.Piszcze;
import Zajecia0303.WzorceProjektowe.WzorzecStrategia.SposobyLatania.NieLatam;

public class GumowaKaczka extends Kaczka{
	public GumowaKaczka() {
		latanieInterfejs = new NieLatam();
		kwakanieInterfejs = new Piszcze();
	}
	
	@Override
	public void wyswietl() {
		System.out.println("Wyświetlam gumową kaczkę");
	}
	
}
