package Lista5.zadanie4;

import java.util.Scanner;

public class InverseCamelCase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder noCamelCase = new StringBuilder();
		String input;

		System.out.println("Podaj zdanie wej�ciowe: ");
		input = scan.nextLine();
		noCamelCase.append(input);

		for (int i = 1; i < noCamelCase.length(); i++) {
			if ((int)noCamelCase.charAt(i) < 97) {
				noCamelCase.setCharAt(i, Character.toLowerCase(noCamelCase.charAt(i)));
				noCamelCase.insert(i, ' ');
			}
		}
		
		System.out.println(noCamelCase.toString());
		scan.close();
	}
}
