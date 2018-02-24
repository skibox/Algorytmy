package Sprawdzian2402.zadanie4;

import java.util.Scanner;

public class JarekRadek {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj x y z:");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		scan.nextLine();
		
		int J, R;
		R = (z - y + x) / 2;
		J = R - x;
		
		System.out.printf("Jarek ma %f lat, Radek ma %f lat", J, R);
		scan.close();
	}
}
