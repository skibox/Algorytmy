package Lista4.zadanie8;


import java.util.Scanner;

public class Control {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean end = false;
		
		while(!end) {
			System.out.println("Podaj dzie�, miesi�c i rok D M Y");

			int day = scan.nextInt();
			int month = scan.nextInt();
			int year = scan.nextInt();
			scan.nextLine();
			
			Date date = new Date(day, month, year);
			System.out.println(date);
			
			System.out.println("Ko�czymy? Y/N");
			String temp = scan.nextLine();
			if (temp == "Y") break;
			else System.out.println("Lecisz");
			scan.close();
		}
	}
}
