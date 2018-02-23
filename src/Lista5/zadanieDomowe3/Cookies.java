package Lista5.zadanieDomowe3;

import java.util.Scanner;
import java.util.Vector;

public class Cookies {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int tasks;
		int guests;
		int cookiesInBox;
		int[] secondsPerCookie;

		Vector<Integer> boxes = new Vector<>();

		System.out.println("Podaj liczbe zestawow: ");
		tasks = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < tasks; i++) {
			System.out.println("Podaj liczbe gosci i ciastek w pudelku");
			guests = scan.nextInt();
			cookiesInBox = scan.nextInt();
			scan.nextLine();

			secondsPerCookie = new int[guests];

			System.out.println("Ilość sekund na ciastko: ");
			for (int j = 0; j < secondsPerCookie.length; j++) {
				secondsPerCookie[j] = scan.nextInt();
				scan.nextLine();
			}

			int tempCookies = 0;
			for (int j = 0; j < secondsPerCookie.length; j++) {
				tempCookies += 86400 / secondsPerCookie[j];
			}

			boxes.add((int) Math.ceil((tempCookies / cookiesInBox)));

		}

		for (int i = 0; i < boxes.size(); i++) {
			System.out.println(boxes.get(i));
		}
		scan.close();

	}
}
