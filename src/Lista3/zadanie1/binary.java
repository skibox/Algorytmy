package Lista3.zadanie1;

import java.util.Scanner;

public class binary {
	public static void main(String[] args) {
		int[] booleanConverted = new int[10];
		int toConvert = 0;
		int temp;
		boolean end = false;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Liczba do przerobienia:");
		toConvert = scan.nextInt();
		scan.nextLine();
		temp = toConvert;
		
		for (int j = 0; j < booleanConverted.length; j++) {
			booleanConverted[j] = 9;
		}
		
		int i = booleanConverted.length;
		while(!end) {
			if(toConvert%2 == 0) booleanConverted[i - 1] = 0;
			else booleanConverted[i - 1] = 1;
			toConvert /= 2;
			i--;
			if(toConvert == 0) end = true;
		}
		
		System.out.println(temp);
		for (int j = 0; j < booleanConverted.length; j++) {
			System.out.printf("%d\t",booleanConverted[j]);
		}
		scan.close();
	}
}
