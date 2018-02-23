package Lista3.zadanie9;

import java.util.Scanner;

public class SpaceCount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;
		int counter = 0;
		
		System.out.println("Podaj zdanie do przeliczenia: ");
		input = scan.nextLine();
		
		for(int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') counter++;
		}
		
		System.out.printf("Spacja wyst�pi�a w zdaniu %d razy", counter);
		scan.close();
	}
}
