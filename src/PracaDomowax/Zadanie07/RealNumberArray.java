package PracaDomowax.Zadanie07;

import java.util.Scanner;

public class RealNumberArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] realArray = new double[10];

		System.out.println("Podaj 10 liczb rzeczywistych: ");
		for (int i = 0; i < realArray.length; i++) {
			realArray[i] = scan.nextDouble();
		}

		System.out.println("Podane liczby: ");
		for (int i = 0; i < realArray.length; i++) {
			System.out.printf("%.1f\t", realArray[i]);
		}
		System.out.println();

		System.out.println("Odwr�cona tablica: ");
		for (int i = realArray.length - 1; i >= 0; i--) {
			System.out.printf("%.1f\t", realArray[i]);
		}
		System.out.println();

		System.out.println("Podniesione do kwadratu: ");
		for (int i = realArray.length - 1; i >= 0; i--) {
			realArray[i] = Math.pow(realArray[i], 2);
			System.out.printf("%.1f\t", realArray[i]);
		}
		System.out.println();

		scan.close();
	}

}
