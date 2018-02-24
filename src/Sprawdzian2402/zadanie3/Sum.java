package Sprawdzian2402.zadanie3;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj wartosci x i y:");
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.nextLine();
		
		int a, b;
		
		b = (x + 9*y)/18;
		a = y - b;
		
		System.out.printf("Liczba to: %d", 10*a + b);
		scan.close();
		
	}
}
