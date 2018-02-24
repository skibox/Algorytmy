package Sprawdzian2402.zadanie1;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj kąt: ");
		int angleDifferential = scan.nextInt(); // 50
		scan.nextLine();
		
		int alfa;
		int beta;
		
		beta = (90 + angleDifferential) / 2;
		alfa = 90 - beta;
		
		System.out.printf("Kąty ostre to %d i %d", alfa, beta);
		scan.close();
	}
}
