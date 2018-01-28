package zadanie5;

import java.util.Scanner;

public class DayOfTheWeek {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		StringBuilder inputWorked = new StringBuilder();
		String temp1;
		int checkArray = 0;
		int checkModulo = 0;

		String[] days = { "PN", "WT", "SR", "CZW", "PT", "SB", "ND" };

		System.out.println("Podaj dzie� i przesuni�cie (np. WT 3): ");
		String input = scan.nextLine();
		inputWorked.append(input);

		temp1 = inputWorked.substring(0, inputWorked.indexOf(" "));

		for (int i = 0; i < days.length; i++) {
			if (temp1.equals(days[i])) {
				checkArray = i;
				break;
			}
		}

		checkModulo = Integer.parseInt(inputWorked.substring(inputWorked.indexOf(" ") + 1));
		if (checkModulo > 7)
			checkModulo = checkModulo % 7;

		try {
			System.out.println(days[checkArray + checkModulo]);
		} catch (IndexOutOfBoundsException e) {
			checkModulo -= 7;
			System.out.println(days[checkArray + checkModulo]);
		}
		scan.close();
	}
}
