package Lista3.zadanie13;

import java.util.Scanner;

public class Time {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int secondsInput;
		int hoursOutput = 0;
		int minutesOutput = 0;
		int secondsOutput = 0;
		int temp = 0;
		int temp2 = 0;
		
		System.out.println("Podaj ilo�� sekund do przeliczenia: ");
		secondsInput = scan.nextInt();
		scan.nextLine();
		
		hoursOutput = secondsInput;
		temp = secondsInput%3600;
		hoursOutput -= temp;
		hoursOutput /= 3600;
		
		minutesOutput = temp;
		temp2 = temp%60;
		minutesOutput -= temp2;
		minutesOutput /= 60;
		
		secondsOutput = temp2;
		
		System.out.printf("%d:%d:%d", hoursOutput, minutesOutput, secondsOutput);
		scan.close();
	}
}
