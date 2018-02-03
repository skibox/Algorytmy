package Lista.zadanieDomowe1;

import java.util.Scanner;

public class Palindromes {
	static private int counter = 1;
	
	public static boolean isPalindrome(int value) {
		String getString = Integer.toString(value);
		StringBuilder sBuilder = new StringBuilder(getString);
		
		if(getString.equals(sBuilder.reverse().toString())) return true;
		else return false;
	}
	
	public static int createNewValue(int value) {
		if(isPalindrome(value)) return value;
		
		StringBuilder sBuilder = new StringBuilder(Integer.toString(value));
		sBuilder.reverse();
		int reversedValue = Integer.parseInt(sBuilder.toString());
		int outputValue = value + reversedValue;
		
		if (isPalindrome(outputValue)) return outputValue;
		else {
			addToCounter();
			return createNewValue(outputValue);
		}
	}
	
	public static void addToCounter() {
		counter++;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj początową wartość: ");
		int inputValue = scan.nextInt();
		scan.nextLine();
		
		System.out.println(createNewValue(inputValue) + " " + counter);
		scan.close();
	}
}
