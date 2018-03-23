package PracaDomowa1003.zadanie4;

import java.util.Scanner;

public class FasadaDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Koko koko = new Koko(1600);
		CukierPuder cukier = new CukierPuder(100);
		Talk talk = new Talk(100);
		
//		System.out.println("Koko? Ile?");
//		String kokoInput = scan.nextLine();
//		if(kokoInput.substring(0) == "Y") {
//			koko = new Koko(Integer.parseInt(kokoInput.substring(2)));
//		}
//		
//		System.out.println("Cukier? Ile?");
//		String sugarInput = scan.nextLine();
//		if(sugarInput.substring(0) == "Y") {
//			cukier = new CukierPuder(Integer.parseInt(sugarInput.substring(2)));
//		}
//		
//		System.out.println("Talk? Ile?");
//		String talkInput = scan.nextLine();
//		if(talkInput.substring(0) == "Y") {
//			talk = new Talk(Integer.parseInt(talkInput.substring(2)));
//		}

//		Object[] objects = new Object[3];
//		objects[0] = koko;
//		objects[1] = cukier;
//		objects[2] = talk;
		
		FasadaLaboratorium laboratorium = new FasadaLaboratorium(koko);
		laboratorium.getKoko30();
		laboratorium.showAmounts();
		System.out.println(laboratorium.sugarAdded);
		System.out.println(laboratorium.talkAdded);
		System.out.println(laboratorium.kokoToAdulterants);
		
		Koko koko2 = new Koko(2000);
		FasadaLaboratorium laboratorium1 = new FasadaLaboratorium(koko2);
		laboratorium1.getKokoPremium60();
		laboratorium1.showAmounts();
		System.out.println(laboratorium1.sugarAdded);
		System.out.println(laboratorium1.talkAdded);
		System.out.println(laboratorium1.kokoToAdulterants);
	
	}
}
