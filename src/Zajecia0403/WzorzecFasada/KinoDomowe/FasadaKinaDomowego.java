package Zajecia0403.WzorzecFasada.KinoDomowe;

public class FasadaKinaDomowego {
	Ekran ekran;
	Projektor projektor;
	Wzmacniacz wzmacniacz;
	
	public FasadaKinaDomowego(Ekran ekran, Projektor projektor, Wzmacniacz wzmacniacz) {
		this.ekran = ekran;
		this.projektor = projektor;
		this.wzmacniacz = wzmacniacz;
	}
	
	public void startWatching() {
		ekran.slideDown();
		projektor.turnOn();
		projektor.setSource("odtwarzacz");
		wzmacniacz.turnOn();
		wzmacniacz.setSource("odtwarzacz");
		wzmacniacz.setVolume(50);
	}
	
	public void stopWatching() {
		wzmacniacz.turnOff();
		projektor.turnOff();
		ekran.slideUp();
	}
}
