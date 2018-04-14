package app;

import java.util.Scanner;

public class StringCharCount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;
		char chosen;
		int charCount = 0;
		
		System.out.println("Podaj wybrany ci¹g znaków: ");
		input = scan.nextLine();
		input.toLowerCase();
		
		System.out.println("Podaj wybrany znak: ");
		chosen = scan.findInLine(".").charAt(0);
		scan.nextLine();
		
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == chosen) charCount++;
		}
		
		System.out.printf("Literka %c wystapi³a w zdaniu %d razy.\n", chosen, charCount);
		scan.close();
	}
	
}
