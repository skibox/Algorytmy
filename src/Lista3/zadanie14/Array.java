package Lista3.zadanie14;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arrayCoefficient = 0;

		System.out.println("Podaj wsp�czynnik n tablicy: ");
		arrayCoefficient = scan.nextInt();
		scan.nextLine();

		int[][] outputArray = new int[arrayCoefficient][arrayCoefficient];

		for (int i = 0; i < outputArray.length; i++) {
			for (int j = 0; j < outputArray.length; j++) {
				if ((i + j) < arrayCoefficient)
					outputArray[i][j] = i + j + 1;
				else
					outputArray[i][j] = i + j - arrayCoefficient + 1;
			}

		}

		for (int i = 0; i < outputArray.length; i++) {
			for (int j = 0; j < outputArray.length; j++) {
				System.out.printf("%d\t", outputArray[i][j]);
			}
			System.out.println();
		}
		scan.close();
	}
}
