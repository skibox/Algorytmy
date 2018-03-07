package PracaDomowa1003.zadanie2.Gorzelnia;

import java.util.Scanner;

import PracaDomowa1003.zadanie2.Gorzelnia.Dodatki.CherryJuice;
import PracaDomowa1003.zadanie2.Gorzelnia.Dodatki.ChokeberryJuice;
import PracaDomowa1003.zadanie2.Gorzelnia.Dodatki.PureBoringWater;
import PracaDomowa1003.zadanie2.Gorzelnia.Dodatki.RaspberryJuice;
import PracaDomowa1003.zadanie2.Gorzelnia.SkladnikiBazowe.SpiritusSanctus;

public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String flavour;
		Moonshine moonshine;
		int desiredAlcoholVolume;
		
		System.out.println("1 - Malinówka");
		System.out.println("2 - Wiśniówka");
		System.out.println("3 - Aroniówka");

		System.out.println("Jakiej naleweczki potrzebujesz?");
		flavour = scan.nextLine();

		switch (flavour.substring(0)) {
			case "1":
				moonshine = new RaspberryJuice(new SpiritusSanctus());
				break;
			case "2":
				moonshine = new CherryJuice(new SpiritusSanctus());
				break;
			case "3":
				moonshine = new ChokeberryJuice(new SpiritusSanctus());
				break;
			default:
				moonshine = new SpiritusSanctus();
				break;
		}

		System.out.println("Procent?");
		desiredAlcoholVolume = scan.nextInt();
		scan.nextLine();
		int waterPartsNeeded = (moonshine.alcoholVolumePercentage() - desiredAlcoholVolume) / 8;
		
		for(int i = 0; i < waterPartsNeeded; i++) {
			moonshine = new PureBoringWater(moonshine);
		}
		
		System.out.print("Otrzymano *" + moonshine.getName() + "* o mocy " + moonshine.alcoholVolumePercentage() + "%");
		if(desiredAlcoholVolume != moonshine.alcoholVolumePercentage()) System.err.printf(" (wybacz, będzie mocniej.)\n");
		else System.out.println();
		System.out.println("Potrzeba 1 części bimbru i " + waterPartsNeeded + " części wody");
		scan.close();
		
	}
}
