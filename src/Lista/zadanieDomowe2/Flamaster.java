package Lista.zadanieDomowe2;

import java.util.Scanner;
import java.util.Vector;

public class Flamaster {
	public static String replaceText(String input) throws ArrayIndexOutOfBoundsException {
		StringBuilder charsAndCounters = new StringBuilder();
		Vector<Character> inputCharArray = new Vector<Character>();
		Vector<Integer> charCounters = new Vector<Integer>();
		Vector<Character> charTypes = new Vector<Character>();
		int counter;

		for (int i = 0; i < input.length(); i++) {
			inputCharArray.add(input.charAt(i));
		}
		// Tu gdzieś się zamotałem, zlicza dobrze ale wywala ex przy ostatnim znaku w Stringu
		// dobra, zlapalem juz blad, jak bede mial chwile to go ogarne
		while (inputCharArray.size() != 1) {
			counter = 1;
			charTypes.add(inputCharArray.get(0));
			if (inputCharArray.size() > 1) {
				while (inputCharArray.get(0) == inputCharArray.get(1)) {
					counter++;
					inputCharArray.remove(0);

		//			inputCharArray.remove(0);
					
				}
				charCounters.add(counter);
			}
			else {
				counter++;
				inputCharArray.remove(0);
			}
			while (!charTypes.isEmpty()) {
				charsAndCounters.append(charTypes.get(0)).append(charCounters.get(0));
				charTypes.remove(0);
				charCounters.remove(0);
			}
		}
		
		return charsAndCounters.toString();
	}

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		
		 System.out.println("Podaj liczbe zestawow: ");
		 int probeCount = scan.nextInt();
		 scan.nextLine();
		
		 String[] inputTexts = new String[probeCount];
		
		 for (int i = 0; i < inputTexts.length; i++) {
		 System.out.println("Podaj " + i + 1 + " zestaw: ");
		 inputTexts[i] = scan.nextLine();
		 }
		
		 scan.close();

		System.out.println(replaceText("AAB"));
	}
}
