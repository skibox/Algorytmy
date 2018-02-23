package Lista5.zadanieDomowe8;

import java.util.Scanner;

public class Linear {
	public static void main(String[] args) {
		double a, b, c, x;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Podaj wspołczynniki ax + b = c | a b c");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		scan.nextLine();
		scan.close();
		
		x = (c - b) / a;
		
		if(a == 0.0 && b != c)
			System.out.println("Równanie nie ma rozwiązań");
		else if(a == 0 && b == c)
			System.out.println("Równanie ma nieskończenie wiele rozwiązań");
		else 
			System.out.printf("x = %.2f", x);		
		
	}
}
