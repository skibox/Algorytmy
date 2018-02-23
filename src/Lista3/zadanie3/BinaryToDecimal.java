package Lista3.zadanie3;

import java.util.Scanner;
import java.util.Stack;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Stack<Boolean> binaryStack = new Stack<Boolean>();
		Scanner scan = new Scanner(System.in);
		boolean end = false;
		boolean currentAdd = false;
		int decimalResult = 0;
		int counter = 0;
		
		System.out.println("Podaj liczb� w sys. binarnym od MSB");
		while (!end) {
			try {
				currentAdd = scan.nextBoolean();
				binaryStack.push(currentAdd);
				if(currentAdd == true) decimalResult += Math.pow(2, counter);
				counter++;
			} catch (Exception ex) {
				end = true;
			}
		}
		
		System.out.printf("\nWynik w systemie dziesi�tnym: %d", decimalResult);
		scan.close();
		
	}
}
