package Zajecia0302.WyszukiwanieMinMax;

import java.util.Scanner;

public class WyszukiwanieMinMax {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Podaj wartości: ");
		String input = scan.nextLine();
		
		String[] inputSplit= input.substring(input.indexOf("[") + 1, input.indexOf("]")).split(",");
		int[] val = new int[inputSplit.length];

		for (int i = 0; i < val.length; i++) {
			val[i] = Integer.parseInt(inputSplit[i]);
		}
		
		int minIndexNumber = 0, minNumber = val[0];
		int maxIndexNumber = 0, maxNumber = val[0];
		
		for (int i = 1; i < val.length - 1; i++) {
			if (val[i] > maxIndexNumber) {
				maxIndexNumber = i;
				maxNumber = val[i];
			}
			if (val[i] < minIndexNumber) {
				minIndexNumber = i;
				minNumber = val[i];
			}
		}
		
		System.out.printf(	"Max = %d (%d) \n Min = %d (%d)",
							maxIndexNumber, maxNumber, minIndexNumber, minNumber);
		scan.close();

	}
}
