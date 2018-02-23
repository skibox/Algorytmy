package Lista5.zadanieDomowe2;

import java.util.Scanner;
import java.util.Vector;

public class Flamaster {
	public static String replaceText(String input) throws ArrayIndexOutOfBoundsException {
		StringBuilder charsAndCounters = new StringBuilder();
		Vector<Character> inputCharArray = new Vector<Character>();
		Vector<Integer> charCounters = new Vector<Integer>();
		Vector<Character> charTypes = new Vector<Character>();
		int counter = 0;

		for (int i = 0; i < input.length(); i++) {
			inputCharArray.add(input.charAt(i));
		}

		while (!inputCharArray.isEmpty()) {

			counter = 0;
			if (inputCharArray.size() > 1) {
				charTypes.add(inputCharArray.get(0));
				try {
					do
						counter++;
					while (inputCharArray.get(0) == inputCharArray.get(counter));
				} catch (IndexOutOfBoundsException e) {
					counter = inputCharArray.size();
				}

				charCounters.add(counter);

				for (int i = 0; i < counter; i++)
					inputCharArray.remove(0);
			} else {
				charTypes.add(inputCharArray.get(0));
				charCounters.add(1);
				inputCharArray.remove(0);
				counter++;
			}
		}

		while (!charCounters.isEmpty()) {
			if (charCounters.get(0) != 1) {
				charsAndCounters.append(charTypes.get(0)).append(charCounters.get(0));
				charTypes.remove(0);
				charCounters.remove(0);
			} else {
				charsAndCounters.append(charTypes.get(0));
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
			System.out.println("Podaj " + (i + 1) + " zestaw: ");
			inputTexts[i] = scan.nextLine();
			System.out.println("Wynik: " + replaceText(inputTexts[i]));
		}

		scan.close();
	}
}
