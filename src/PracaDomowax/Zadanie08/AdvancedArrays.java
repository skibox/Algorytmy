package PracaDomowax.Zadanie08;

import java.util.concurrent.ThreadLocalRandom;

public class AdvancedArrays {
	public static void main(String[] args) {
		int numberCount = 10;
		int[] naturalNumbers = new int[numberCount];
		int lowestNumber = 200;
		int highestNumber = 0;
		int sumTotal = 0;
		double meanNumber = 0;
		int lowerThanMean = 0;
		int higherThanMean = 0;

		for (int i = 0; i < naturalNumbers.length; i++) {
			naturalNumbers[i] = ThreadLocalRandom.current().nextInt(1, 200);
			sumTotal += naturalNumbers[i];
		}

		meanNumber = (double) sumTotal / numberCount;

		for (int i = 0; i < naturalNumbers.length; i++) {
			if (naturalNumbers[i] > highestNumber)
				highestNumber = naturalNumbers[i];
			
			if (naturalNumbers[i] < lowestNumber)
				lowestNumber = naturalNumbers[i];
			
			if (naturalNumbers[i] > meanNumber)
				higherThanMean++;
			
			if (naturalNumbers[i] < meanNumber)
				lowerThanMean++;
		}

		System.out.println("Wylosowane liczby: ");
		for (int i = 0; i < naturalNumbers.length; i++) {
			System.out.printf("%d\t", naturalNumbers[i]);
		}
		System.out.println();
		System.out.println();

		System.out.printf("MIN = %d, MAX = %d\n", lowestNumber, highestNumber);
		System.out.printf("�rednia = %.2f\n", meanNumber);
		System.out.printf("Mniejszych od �redniej: %d\n", lowerThanMean);
		System.out.printf("Wi�kszych od �redniej: %d\n", higherThanMean);
		System.out.println();
		
		System.out.println("Liczby w odwrotnej kolejno�ci: ");
		for (int i = naturalNumbers.length - 1; i >= 0; i--) {
			System.out.printf("%d\t", naturalNumbers[i]);
		}
		System.out.println();
		

	}
}
