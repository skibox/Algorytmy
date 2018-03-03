package Zajecia0303.WzorceProjektowe.WzorzecStrategia;

import Zajecia0303.WzorceProjektowe.WzorzecStrategia.DzikaKaczka;
import Zajecia0303.WzorceProjektowe.WzorzecStrategia.GumowaKaczka;
import Zajecia0303.WzorceProjektowe.WzorzecStrategia.KaczkaModel;
import Zajecia0303.WzorceProjektowe.WzorzecStrategia.KaczkaPlaskonos;
import Zajecia0303.WzorceProjektowe.WzorzecStrategia.KaczkaWabik;
import Zajecia0303.WzorceProjektowe.WzorzecStrategia.SposobyLatania.NieLatam;

public class Main {
	public static void main(String[] args) {
		DzikaKaczka 	dzikaKaczka 	= new DzikaKaczka();
		KaczkaPlaskonos kaczkaPlaskonos = new KaczkaPlaskonos();
		KaczkaWabik 	kaczkaWabik 	= new KaczkaWabik();
		GumowaKaczka 	gumowaKaczka 	= new GumowaKaczka();
		KaczkaModel		kaczkaModel 	= new KaczkaModel();

		dzikaKaczka.wykonajKwacz();
		dzikaKaczka.wykonajLec();
		dzikaKaczka.wyswietl();
		System.out.println();
		kaczkaPlaskonos.wykonajKwacz();
		kaczkaPlaskonos.wykonajLec();
		kaczkaPlaskonos.wyswietl();
		System.out.println();
		kaczkaWabik.wykonajKwacz();
		kaczkaWabik.wykonajLec();
		kaczkaWabik.wyswietl();
		System.out.println();
		gumowaKaczka.wykonajKwacz();
		gumowaKaczka.wykonajLec();
		gumowaKaczka.wyswietl();
		System.out.println();
		kaczkaModel.wykonajKwacz();
		kaczkaModel.wykonajLec();
		kaczkaModel.wyswietl();
		kaczkaModel.setLatanieInterfejs(new NieLatam());
		System.out.println();
		kaczkaModel.wykonajKwacz();
		kaczkaModel.wykonajLec();
		kaczkaModel.wyswietl();
	}
}
