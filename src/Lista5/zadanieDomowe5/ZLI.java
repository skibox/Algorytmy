package Lista5.zadanieDomowe5;

import java.util.Scanner;

public class ZLI {
	
	public static void main(String[] args) {
		int[] lowerCaseCounter = new int[25]; // a - 0
		int[] upperCaseCounter = new int[25]; // A - 0
		int taskCount = 0;
		
		StringBuilder inputSum = new StringBuilder();
		Scanner scan = new Scanner(System.in);
		System.out.println("Ilosc zestawow: ");
		taskCount = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Podaj zdania do analizy: ");
		for(int i = 0; i < taskCount; i++) {
			inputSum.append(scan.nextLine());
		}
		scan.close();
		
		char[] inputWordCharacters = inputSum.toString().toCharArray();
		
		for (int i = 0; i < inputWordCharacters.length; i++) {
			if		(Character.isLowerCase(inputWordCharacters[i])) {
				lowerCaseCounter[(int)(inputWordCharacters[i]) - 97]++;
			}
			
			else if	(Character.isUpperCase(inputWordCharacters[i])) {
				upperCaseCounter[(int)(inputWordCharacters[i]) - 65]++;
			}
			
			else continue;
		}

		System.out.println("Wystepujace litery: ");
		for (int i = 0; i < lowerCaseCounter.length; i++) {
			if (lowerCaseCounter[i] != 0)
				System.out.println((char) (i + 97) + ": " + lowerCaseCounter[i]);
		}

		for (int i = 0; i < upperCaseCounter.length; i++) {
			if (upperCaseCounter[i] != 0)
				System.out.println((char) (i + 65) + ": " + upperCaseCounter[i]);
		}
	}
}
