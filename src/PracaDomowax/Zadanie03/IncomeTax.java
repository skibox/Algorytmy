package PracaDomowax.Zadanie03;

import java.util.Scanner;

public class IncomeTax {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double userTax = 0;

		System.out.println("Podaj swoje zarobki: ");
		double userSalary = scan.nextDouble();
		scan.nextLine();

		if (userSalary <= 556.02)
			userTax = 0;
		else if (userSalary <= 85528) {
			userTax = userSalary * 0.18 - 556.02;
		} else
			userTax = 14839.02 + (userSalary - 85528) * 0.32;

		System.out.printf("Tw�j podatek dochodowy to: %.2f z�\n", userTax);
		scan.close();
	}
}
