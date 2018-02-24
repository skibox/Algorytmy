package Sprawdzian2402.zadanie2;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj wartości z i s:");
		double z = scan.nextDouble();
		double s = scan.nextDouble();
		scan.nextLine();
		
		double x, y;
		
		y = z/(s+1);
		x = z - z/(s+1);
		
		System.out.printf("Liczba mniejsza: %.2f, liczba większa: %.2f", x, y);
		scan.close();
	}
}
