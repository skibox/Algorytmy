package Lista3.zadanie21;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Lottery {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		int lotteryNumber = ThreadLocalRandom.current().nextInt(0,99);
		//lotteryNumber = 5; testy
		int firstLotteryNumber = lotteryNumber/10;
		int secondLotteryNumber = lotteryNumber - firstLotteryNumber*10;
		int pickedNumber;
		
		System.out.println("Podaj liczb� od 1 do 99: ");
		while(true) {
			pickedNumber = scan.nextInt();
			if(pickedNumber > 99) {
				System.out.println("Od 1 do 99: ");
				continue;
			}
			else break;
		}
		
		int firstPickedNumber = pickedNumber/10;
		int secondPickedNumber = pickedNumber - firstPickedNumber*10;
		
		if(pickedNumber == lotteryNumber) {
			System.out.println("Najwy�sza wygrana - 10000$");
			System.out.printf("Prawid�owy numer: %d\n", lotteryNumber);
		}
		else if((secondPickedNumber*10 + firstPickedNumber) == lotteryNumber) {
			System.out.println("Druga wygrana - 3000$");
			System.out.printf("Prawid�owy numer: %d\n", lotteryNumber);
		}
		else if((firstPickedNumber == firstLotteryNumber) && (secondPickedNumber != secondLotteryNumber)) {
			System.out.println("Trzecia wygrana - 1000$");
			System.out.printf("Prawid�owy numer: %d\n", lotteryNumber);
		}
		else if((firstPickedNumber != firstLotteryNumber) && (secondPickedNumber == secondLotteryNumber)) {
			System.out.println("Trzecia wygrana - 1000$");
			System.out.printf("Prawid�owy numer: %d\n", lotteryNumber);
		}
		else if((secondPickedNumber == firstLotteryNumber) && (firstPickedNumber != secondLotteryNumber)) {
			System.out.println("Trzecia wygrana - 1000$");
			System.out.printf("Prawid�owy numer: %d\n", lotteryNumber);
		}
		else if((secondPickedNumber != firstLotteryNumber) && (firstPickedNumber == secondLotteryNumber)) {
			System.out.println("Trzecia wygrana - 1000$");
			System.out.printf("Prawid�owy numer: %d\n", lotteryNumber);
		}
		else {
			System.out.println("Brak wygranej.");
			System.out.printf("Prawid�owy numer: %d\n", lotteryNumber);
		}
		scan.close();
	}
}
