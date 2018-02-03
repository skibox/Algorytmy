package Lista.zadanie11;

import java.util.Scanner;

public class Control {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj dwie liczby do NWW");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.printf("NWW liczb %d i %d jest %d", a, b, NWW.NWWc(a,b));
		scan.close();
	}
}
