package Lista3.zadanie10;

import java.util.Scanner;

public class WeirdAdding {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input;
		int output;
		
		System.out.println("Podaj warto�� N: ");
		input = scan.nextInt();
		scan.nextLine();
		
		output = 100*input + 2*10*input + 3*input;
		System.out.println("Wynik N + NN + NNN to: " + output);
		scan.close();
	}
}
