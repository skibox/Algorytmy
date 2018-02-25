package Lista5.zadanie15;

import java.util.Scanner;
import java.util.Stack;

public class ONP {
	
	public static void main(String[] args) {
		Stack<Integer> onp = new Stack<Integer>();
		Stack<Integer> check = new Stack<Integer>();

		Scanner scan = new Scanner(System.in);
		char input;

		System.out.println("Dodawaj na stos: (= - koniec)");
		while (true) {
			input = scan.nextLine().charAt(0);
			if (input == '=')
				break;
			else if (Character.isDigit(input)) {
				check.add(Character.getNumericValue(input));
				onp.add(Character.getNumericValue(input));
			} else if (input == '+') {
				onp.add(onp.pop() + onp.pop());
			} else if (input == '-') {
				onp.add(onp.pop() - onp.pop());
			} else if (input == '*') {
				onp.add(onp.pop() * onp.pop());
			} else if (input == '/') {
				onp.add(onp.pop() / onp.pop());
			}
		}
		System.out.println("Wynik: ");
		System.out.println(onp.pop());
		
		scan.close();

	}
}
