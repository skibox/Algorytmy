package zadanie17;

import java.util.Scanner;

public class Kindergarden {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int childrenInClass1;
		int childrenInClass2;
		
		System.out.println("Podaj liczbe dzieci w klasach: ");
		System.out.println("Klasa 1: ");
		childrenInClass1 = scan.nextInt();
		scan.nextLine();
		System.out.println("Klasa 2: ");
		childrenInClass2 = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Minimalna liczba cukierkow: ");
		System.out.println(NWW.NWWc(childrenInClass1, childrenInClass2));
	
		scan.close();
	}
}
