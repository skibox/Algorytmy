package zadanie7;

import java.util.Scanner;

public class SweetsWithJohny {

	public static void main(String[] args) {
		int studentCount;
		int sweetsCount;
		Scanner scan = new Scanner(System.in);

		System.out.println("Podaj ilo�� uczni�w i cukierk�w (osoby cukierki): ");
		studentCount = scan.nextInt();
		sweetsCount = scan.nextInt();
		scan.nextLine();

		studentCount--;

		if (studentCount % sweetsCount == 0)
			System.out.println(" => NIE");
		else if (studentCount > sweetsCount)
			System.out.println(" => CUKIERK�W JEST ZBYT MA�O");
		else System.out.println(" => TAK " + sweetsCount%studentCount);
	
		scan.close();
	}

}
