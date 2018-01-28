package zadanie9;

import java.util.Scanner;

public class IDcard {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj numer dowodu: ");
		String IDnumber = scan.nextLine();
		char[] IDnumberArray = IDnumber.toCharArray();
		int[] weight = { 7, 3, 1, 9, 7, 3, 1, 7, 3 };
		int finalCheck = 0;
		int letterCheck = 0;
		
		for (int i = 0; i < IDnumberArray.length; i++) {

			if (i < 3) {
				letterCheck = (int)IDnumberArray[i];
				letterCheck -= 55;
				finalCheck += letterCheck * weight[i];
			}
			finalCheck += IDnumberArray[i] * weight[i];
		}

		finalCheck %= 10;

		System.out.println(finalCheck);
		if(finalCheck == 0) System.out.println("Numer poprawny");
		scan.close();
	}

}
