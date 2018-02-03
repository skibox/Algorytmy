package Lista.zadanie10;

import java.util.Scanner;

public class NWD {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		boolean end = false;
		System.out.println("Podaj dwie liczby: ");
		System.out.print("A = ");
		a = scan.nextInt();
		System.out.print("\nB = ");
		b = scan.nextInt();
		
		while(!end) {
			if( a == b ) {
				System.out.println("NWD = " + a);
				end = true;
				scan.close();
			}
			else {
				if ( a < b ) {
					b = b - a;
				}
				else {
					a = a - b;
				}
			}
		}	
			
	}
}
