package Lista.zadanie6;

import java.util.Locale;
import java.util.Scanner;

public class Bajtocka {
	public static void main(String[] args) {
		boolean end = false;

		int testCount = 0;
		int userCount = 0;
		double chalkUsage = 0;
		int a = 0;
		int b = 0;
		int c = 0;

		double p = 0;
		double triangleArea = 0;
		double totalArea = 0;

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Liczba test�w: ");
		testCount = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < testCount; i++) {
			System.out.println("Liczba dzieci; zu�ycie kredy");
			userCount = scan.nextInt();
			chalkUsage = scan.nextDouble();
			scan.nextLine();
			for (int j = 0; j < userCount; j++) {
				while (!end) {
					System.out.println("Podaj trzy boki tr�jk�ta");
					a = scan.nextInt();
					b = scan.nextInt();
					c = scan.nextInt();
					p = 0.5 * (a + b + c);
					triangleArea = Math.sqrt(p * (p - a) * (p - b) * (p - c));

					if (triangleArea == 0 || Double.isNaN(triangleArea)) {
						System.out.println("Tr�jk�t nie mo�e zosta� utworzony.");
						continue;
					}

					else {
						totalArea += triangleArea;
						end = true;
					}

				}

				triangleArea /= 100000; // zamiana na m^2
				System.out.printf("Wymagana ilo�� kredy w kg: %.3f\n", totalArea * chalkUsage);
				totalArea = 0;
				end = false;
			}

		}
		System.out.println("Koniec dzia�ania");
		scan.close();

	}
}
