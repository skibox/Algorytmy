package Lista.zadanie12;

import java.util.Scanner;

public class PESEL {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String pesel;
		
		int[] arrayCheck = {1,3,7,9,1,3,7,9,1,3,1};
		char[] arrayPESEL = new char[11];
		int tempPESELINT;
		int finalCheck = 0;
		
		System.out.println("Podaj numer PESEL: ");
		pesel = scan.nextLine();
		arrayPESEL = pesel.toCharArray();
		
		for (int i = 0; i < arrayPESEL.length; i++) {
			tempPESELINT = (int)arrayPESEL[i];
			arrayCheck[i] *= tempPESELINT;
			finalCheck += arrayCheck[i];
		}
		
		if(finalCheck%10 == 0) System.out.printf("PESEL %s jest prawid�owy", pesel);
		else System.out.printf("PESEL %s jest nieprawid�owy", pesel);
		
		scan.close();
		
	}
}
