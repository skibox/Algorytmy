package Zajecia0303.zadanie1;

import java.util.Scanner;

public class SortowanieDemo {
	public static void main(String[] args) {
		System.out.println("Wybierz sposób sortowania: ");
		System.out.println("1 - BubbleSort");
		System.out.println("2 - InsertionSort");

		Scanner scan = new Scanner(System.in);
		int[] arrayToSort = { 1, 8, 4, 6, 2, 3, 44, 6, 1, 33, 5, 8 };
		DaneDoBabelkow daneDoBabelkow = new DaneDoBabelkow();
		DaneDoWstawiania daneDoWstawiania = new DaneDoWstawiania();

		switch (scan.nextLine().substring(0)) {
		case "1":
			daneDoBabelkow.printArray(daneDoBabelkow.sortArray(arrayToSort));
			break;
		case "2":
			daneDoWstawiania.printArray(daneDoWstawiania.sortArray(arrayToSort));
			break;
		default:
			break;
		}
		
		scan.close();

	}
}
