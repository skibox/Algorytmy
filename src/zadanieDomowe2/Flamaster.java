package zadanieDomowe2;

import java.util.Scanner;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class Flamaster {
	public static String replaceText(String input) {
		StringBuilder output = new StringBuilder();
		char[] inputChars = input.toCharArray();
		
		for (int i = 0; i < inputChars.length; i++) {
			
		}
		
		
		return output.toString();
	}
	
	public static int countChars(char inputCharacter, char[] inputCharArray) {
		int counter = 0;
		for (int i = 0; i < inputCharArray.length; i++) {
			
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Podaj liczbe zestawow: ");
		int probeCount = scan.nextInt();
		scan.nextLine();
		
		String[] inputTexts = new String[probeCount];
		
		for (int i = 0; i < inputTexts.length; i++) {
			System.out.println("Podaj " + i+1 + " zestaw: ");
			inputTexts[i] = scan.nextLine();
		}
		
		
	}
}
