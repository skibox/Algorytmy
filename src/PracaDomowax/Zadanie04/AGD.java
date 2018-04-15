package PracaDomowax.Zadanie04;

import java.util.Locale;
import java.util.Scanner;

public class AGD {
	
	public static void creditInfo(double taxPercent, double finalPrice, int rateCount, double initialPrice) {
		System.out.printf("Cena po oprocentowaniu: %.2f z�\n", finalPrice);
		System.out.printf("Rata miesi�czna na produkt to: %.2f z�\n", rateValue(taxPercent, rateCount, initialPrice));
	}
	
	public static double rateValue(double taxPercent, int rateCount, double initialPrice) {
		double q = 1 + (taxPercent/12);
		double rate = (initialPrice * Math.pow(q, rateCount) * (q - 1)) / (Math.pow(q, rateCount) - 1);
		return rate;
	}
	
	public static void main(String[] args) {
		double initialPrice = 0;
		double finalPrice = 0;
		int rateCount = 0;
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Podaj cen� produktu: ");
		initialPrice = scan.nextDouble();
		scan.nextLine();
		System.out.println("Podaj ilo�� rat: ");
		rateCount = scan.nextInt();
		scan.nextLine();
		
		if (rateCount >= 6 && rateCount <= 12) {
			finalPrice = rateCount*rateValue(0.025, rateCount, initialPrice);
			creditInfo(0.025, finalPrice, rateCount, initialPrice);
		}
		else if (rateCount >= 13 && rateCount <= 24) {
			finalPrice = rateCount*rateValue(0.05, rateCount, initialPrice);
			creditInfo(0.05, finalPrice, rateCount, initialPrice);
		}
		else if (rateCount >= 25 && rateCount <= 48) {
			finalPrice = rateCount*rateValue(0.1, rateCount, initialPrice);
			creditInfo(0.1, finalPrice, rateCount, initialPrice);
		}
		
		scan.close();
		
		
 	}
}
