package Lista3.zadanie16;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomWalker {

	public static boolean pathComplete(boolean[][] walkerField) {
		boolean isComplete = true;

		for (int i = 0; i < walkerField.length; i++) {
			for (int j = 0; j < walkerField.length; j++) {
				if (walkerField[i][j] == false)
					return false;
			}
		}

		return isComplete;
	}

	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		int arraySize = 0;
		int whichWay = 0;
		long counter = 0;
		boolean end = false;

		System.out.println("Podaj wielko�� tablicy: ");
		arraySize = scan.nextInt();
		scan.nextLine();

		boolean[][] walkerField = new boolean[arraySize][arraySize];

		System.out.println("Tablica wej�ciowa: ");
		for (int j2 = 0; j2 < walkerField.length; j2++) {
			for (int k = 0; k < walkerField.length; k++) {
				System.out.printf("%b ", walkerField[j2][k]);
			}
			System.out.println();
		}
		System.out.println();

		int startingPointX = ThreadLocalRandom.current().nextInt(0, arraySize - 1);
		int startingPointY = ThreadLocalRandom.current().nextInt(0, arraySize - 1);

		int i = startingPointY;
		int j = startingPointX;

		walkerField[i][j] = true;

		while (!end) {
			try {
				whichWay = ThreadLocalRandom.current().nextInt(0, 100);
				if (whichWay <= 25)
					i--;
				else if (whichWay <= 50 && whichWay > 25)
					i++;
				else if (whichWay <= 75 && whichWay > 50)
					j--;
				else if (whichWay > 75)
					j++;

				if (walkerField[i][j] == false)
					walkerField[i][j] = true;
			} catch (IndexOutOfBoundsException e) {
				if (whichWay <= 25)
					i++;
				else if (whichWay <= 50 && whichWay > 25)
					i--;
				else if (whichWay <= 75 && whichWay > 50)
					j++;
				else if (whichWay > 75)
					j--;
				counter++;
				continue;
			}

			System.out.println("Tablica wyj�ciowa: ");
			for (int j2 = 0; j2 < walkerField.length; j2++) {
				for (int k = 0; k < walkerField.length; k++) {
					System.out.printf("%b ", walkerField[j2][k]);
				}
				System.out.println();
			}
			System.out.println();
			counter++;
			Thread.sleep(100);
			end = pathComplete(walkerField);
		}

		System.out.println("Liczba wymaganych krok�w: " + counter);
		scan.close();
	}
}
