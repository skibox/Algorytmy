package PracaDomowax.Zadanie10;

import java.util.Scanner;

public class LowestHighestFunction {
	
	public static int highestNumber(int a, int b, int c) {
		if (a >= b) {
			if (a >= c) return a;
			else return c;
		}
		else {
			if (b >= c) return b;
			else return c;
		}
	}
	
	public static int lowestNumber(int a, int b, int c) {
		if (a <= b) {
			if (a <= c) return a;
			else return c;
		}
		else {
			if (b <= c) return b;
			else return c;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Podaj 3 liczby naturalne: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		System.out.printf("Najmniejsza: %d; Najwi�ksza: %d\n",
						   lowestNumber(a, b, c), highestNumber(a, b, c));
		scan.close();
	}
	
}
