package PracaDomowax.Zadanie02;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Podaj wzrost w metrach");
		double userHeight = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("Podaj wag� w kg");
		double userWeight = scan.nextDouble();
		scan.nextLine();
		
		double userBMI = userWeight/Math.pow(userHeight, 2);
		System.out.printf("Twoje BMI to %.2f, ", userBMI);
		if (userBMI > 24.9) System.out.printf("nadwaga.\n");
		else if (userBMI < 18.5) System.out.printf("niedowaga.\n");
		else System.out.printf("waga jest prawid�owa.\n");
		
		scan.close();
	}
}
