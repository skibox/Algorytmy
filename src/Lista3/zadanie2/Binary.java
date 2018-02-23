package Lista3.zadanie2;

import java.util.Scanner;
import java.util.Stack;

public class Binary {
	public static void main(String[] args) {
		Stack<Boolean> binaryStack = new Stack<Boolean>();
		int toConvert = 0;
		int counter = 0;
		boolean end = false;

		Scanner scan = new Scanner(System.in);

		System.out.println("Liczba do przerobienia:");
		toConvert = scan.nextInt();
		scan.nextLine();

		while (!end) {
			if (toConvert % 2 == 0)
				binaryStack.push(false);
			else
				binaryStack.push(true);
			toConvert /= 2;
			if (toConvert == 0)
				end = true;
			counter++;
		}

		while(!binaryStack.isEmpty()){
			System.out.printf("%b ",binaryStack.peek());
			binaryStack.pop();
		}
		System.out.println();
		System.out.printf("%d cyfr",counter);
		scan.close();
	}
}
