package Lista5.zadanieDomowe6;

import java.util.Scanner;

public class Samolot {
	public static void main(String[] args) {
		int businessSeatsInRow;
		int economicSeatsInRow;
		int businessRows;
		int economicRows;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Biznesowa miejsca w rzędzie, biznesowa rzędy: ");
		businessSeatsInRow 	= scan.nextInt();
		businessRows 		= scan.nextInt();
		scan.nextLine();
		
		System.out.println("Ekonomiczna miejsca w rzędzie, ekonomiczna rzędy: ");
		economicSeatsInRow 	= scan.nextInt();
		economicRows 		= scan.nextInt();
		scan.nextLine();
		
		scan.close();
		
		int seatsInPlane = 	businessRows*businessSeatsInRow
							+
							economicRows*economicSeatsInRow;
		
		System.out.println("Liczba miejsc w samolocie: " + seatsInPlane);
	}
}
