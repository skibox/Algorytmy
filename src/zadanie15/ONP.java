package zadanie15;

import java.util.Scanner;
import java.util.Stack;

public class ONP {
	public static void main(String[] args) {
		Stack<Integer> onp = new Stack<Integer>();
		Stack<Integer> check = new Stack<Integer>();

		Scanner scan = new Scanner(System.in);
		char input = 'a';

		System.out.println("Dodawaj na stos: (= - koniec)");
		while (true) {
			input = scan.nextLine().charAt(0);
			if (input == '=')
				break;
			else if (Character.isDigit(input)) {
				check.add(Character.getNumericValue(input));
				onp.add(Character.getNumericValue(input));
			} else if (input == '+') {
				int temp1 = onp.peek();
				onp.pop();
				int temp2 = onp.peek();
				onp.pop();
				onp.add(temp1 + temp2);
			} else if (input == '-') {
				int temp1 = onp.peek();
				onp.pop();
				int temp2 = onp.peek();
				onp.pop();
				onp.add(temp1 + temp2);
			} else if (input == '*') {
				int temp1 = onp.peek();
				onp.pop();
				int temp2 = onp.peek();
				onp.pop();
				onp.add(temp1 * temp2);
			} else if (input == '/') {
				int temp1 = onp.peek();
				onp.pop();
				int temp2 = onp.peek();
				onp.pop();
				onp.add(temp1 / temp2);
			}
		}
		System.out.println("Wynik: ");
		System.out.println(onp.peek());
		
		scan.close();

	}
}
