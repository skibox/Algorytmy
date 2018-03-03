package Zajecia0303.WzorceProjektowe.WzorzecStrategia;

import Zajecia0303.WzorceProjektowe.WzorzecStrategia.SposobyKwakania.KwakanieInterfejs;
import Zajecia0303.WzorceProjektowe.WzorzecStrategia.SposobyLatania.LatanieInterfejs;

public abstract class Kaczka{
	protected LatanieInterfejs 	latanieInterfejs;
	protected KwakanieInterfejs kwakanieInterfejs;
	
	public void setLatanieInterfejs(LatanieInterfejs latanieInterfejs) {
		this.latanieInterfejs = latanieInterfejs;
	}
	
	public void setKwakanieInterfejs(KwakanieInterfejs kwakanieInterfejs) {
		this.kwakanieInterfejs = kwakanieInterfejs;
	}
	
	public void wykonajKwacz() {
		kwakanieInterfejs.kwacz();
	}
	
	public void wykonajLec() {
		latanieInterfejs.lec();
	}
	
	public void plywaj() {
		System.out.println("Pływu pływu");
	}
	
	public void wyswietl() {
		System.out.println("Wyświetlam kaczkę");
	}
	

}
