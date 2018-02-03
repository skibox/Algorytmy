package Lista.zadanie3;

import java.util.Scanner;

public class TrimCamelCase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder noCamelCase = new StringBuilder();
		String input;
		
		System.out.println("Podaj zdanie wej�ciowe: ");
		input = scan.nextLine();
		noCamelCase.append(input);
		
		for(int i = 0; i < noCamelCase.length(); i++) {
			if(noCamelCase.charAt(i) == ' ') {
				noCamelCase.setCharAt(i+1, Character.toUpperCase(noCamelCase.charAt(i+1)));
				noCamelCase.deleteCharAt(i);
			}
		}
		
		System.out.println(noCamelCase.toString());
		scan.close();
	}
}
