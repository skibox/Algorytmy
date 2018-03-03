package Zajecia0303.WzorceProjektowe.WzorzecStrategia;

import Zajecia0303.WzorceProjektowe.WzorzecStrategia.SposobyKwakania.KwakamBoUmiem;
import Zajecia0303.WzorceProjektowe.WzorzecStrategia.SposobyLatania.LatamBoMamSkrzydla;

public class DzikaKaczka extends Kaczka{
	public DzikaKaczka() {
		latanieInterfejs = new LatamBoMamSkrzydla();
		kwakanieInterfejs = new KwakamBoUmiem();
	}
	
	@Override
	public void wyswietl() {
		System.out.println("Wyświetlam dziką kaczkę");
	}
}
