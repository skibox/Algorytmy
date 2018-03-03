package Zajecia0303.WzorceProjektowe.WzorzecStrategia;

import Zajecia0303.WzorceProjektowe.WzorzecStrategia.SposobyKwakania.NieKwakam;
import Zajecia0303.WzorceProjektowe.WzorzecStrategia.SposobyLatania.LotZNapedemRakietowym;

public class KaczkaModel extends Kaczka{
	public KaczkaModel() {
		latanieInterfejs = new LotZNapedemRakietowym();
		kwakanieInterfejs = new NieKwakam();
	}
	
	@Override
	public void wyswietl() {
		System.out.println("Wyświetlam model kaczki");
	}
}
