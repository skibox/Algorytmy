package app;

import java.util.Scanner;

public class ArithmeticMean {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberCount = 0;
		int sumTotal = 0;
		
		System.out.println("Ile liczb chcesz wczytaæ?");
		numberCount = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Podaj liczby: ");
		for (int i = 0; i < numberCount; i++) {
			sumTotal += scan.nextInt();
			scan.nextLine();
		}
		
		System.out.printf("Suma liczb: %d; Œrednia: %.2f", sumTotal, (double)sumTotal/numberCount);
		scan.close();
		
		
	}
}
