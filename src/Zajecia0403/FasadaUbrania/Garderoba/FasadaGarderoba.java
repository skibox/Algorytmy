package Zajecia0403.FasadaUbrania.Garderoba;

import java.util.ArrayList;
import java.util.Calendar;

public class FasadaGarderoba {
	ArrayList<Cloth> clothes = new ArrayList<>();
	
	Cloth bielizna = new Bielizna();
	Cloth skarpety = new Skarpety();
	Cloth spodnie = new Spodnie();
	Cloth bluza = new Bluza();
	Cloth kurtka = new Kurtka();
	Cloth koszula = new Koszula();
	Cloth czapa = new Czapa();
	Cloth szalik = new Szalik();
	Cloth rekawiczki = new Rekawiczki();
	
	
	public FasadaGarderoba() {
		clothes.add(bielizna);
		clothes.add(skarpety);
		clothes.add(spodnie);
		clothes.add(koszula);
		clothes.add(bluza);
		clothes.add(kurtka);
		clothes.add(czapa);
		clothes.add(szalik);
		clothes.add(rekawiczki);
	}
	
	public void takeOffClothes() {
		bielizna.takeOff();
		skarpety.takeOff();
		spodnie.takeOff();
		koszula.takeOff();
		bluza.takeOff();
		kurtka.takeOff();
		czapa.takeOff();
		szalik.takeOff();
		rekawiczki.takeOff();
	}
	
	public void wearForSpring() {
		wearForSummer();
		bluza.wear();
	}
	
	public void wearForSummer() {
		takeOffClothes();
		bielizna.wear();
		skarpety.wear();
		spodnie.wear();
		koszula.wear();
	}
	
	public void wearForAutumn() {
		wearForSummer();
		bluza.wear();
		kurtka.wear();
	}
	
	public void wearForWinter() {
		wearForSummer();
		kurtka.wear();
		czapa.wear();
		szalik.wear();
		rekawiczki.wear();
	}
	
	public String showClothes() {
		StringBuilder output = new StringBuilder();
		for(Cloth cloth : clothes) {
			if(cloth.isWorn()) output.append(cloth.getClass().getSimpleName() + " ").append(cloth.isWorn() + "\n");
		}
		
		return output.toString();
	}
	
	public String checkForSeason() {
		String[] seasons = {"Winter","Winter","Spring","Spring","Spring","Spring","Summer","Summer","Summer","Autumn","Autumn","Autumn","Winter"};
		
		return seasons[Calendar.MONTH + 1];
	}
	
	public void justPutThemClothes() {
		switch (checkForSeason()) {
			case "Spring":
				wearForSpring();
				break;
			case "Summer":
				wearForSummer();
				break;
			case "Autumn":
				wearForAutumn();
				break;
			case "Winter":
				wearForWinter();
				break;
			default:
				break;
		}
	}
}
