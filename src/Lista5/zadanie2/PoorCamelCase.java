package Lista5.zadanie2;

import java.util.Scanner;

public class PoorCamelCase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder noCamelCase = new StringBuilder();
		String input;
		System.out.println("Podaj zdanie wej�ciowe: ");
		input = scan.nextLine();
		noCamelCase.append(input);
		
		for(int i = 0; i < noCamelCase.length(); i++) {
			if(i%2 == 0) {
				noCamelCase.setCharAt(i, Character.toUpperCase(noCamelCase.charAt(i)));
			}
			else {
				noCamelCase.setCharAt(i, Character.toLowerCase(noCamelCase.charAt(i)));
			}
		}
		System.out.println("Zdanie przerobione: ");
		System.out.println(noCamelCase.toString());
		
		scan.close();
 	}
}
