package Lista3.zadanie24;

import java.util.Scanner;

public class Barcodes {
	public static void longLine() {
		System.out.println("*****");
	}

	public static void shortLine() {
		System.out.println("**");
	}

	public static void decodeNumber(char number) {
		switch (number) {
		case '0':
			longLine();
			longLine();
			shortLine();
			shortLine();
			shortLine();
			break;
		case '1':
			shortLine();
			shortLine();
			shortLine();
			longLine();
			longLine();
			break;
		case '2':
			shortLine();
			shortLine();
			longLine();
			shortLine();
			longLine();
			break;
		case '3':
			shortLine();
			shortLine();
			longLine();
			longLine();
			shortLine();
			break;
		case '4':
			shortLine();
			longLine();
			shortLine();
			shortLine();
			longLine();
			break;
		case '5':
			shortLine();
			longLine();
			shortLine();
			longLine();
			shortLine();
			break;
		case '6':
			shortLine();
			longLine();
			longLine();
			shortLine();
			shortLine();
			break;
		case '7':
			longLine();
			shortLine();
			shortLine();
			shortLine();
			longLine();
			break;
		case '8':
			longLine();
			shortLine();
			shortLine();
			longLine();
			shortLine();
			break;
		case '9':
			longLine();
			shortLine();
			longLine();
			shortLine();
			shortLine();
			break;
		default:
			System.out.println("Nieznany znak.");
			break;
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char numberToDecode;
		int checksumDigit = 0;

		System.out.println("Please enter your zipcode: ");
		StringBuilder zipcodeString = new StringBuilder(scan.nextLine());

		longLine();

		for (int i = 0; i < zipcodeString.length(); i++) {
			numberToDecode = zipcodeString.charAt(i);
			checksumDigit += Character.getNumericValue(numberToDecode);
			
			decodeNumber(numberToDecode);
		}
		decodeNumber(Character.forDigit(checksumDigit%10, 10));
		
		longLine();
		scan.close();

	}
}
