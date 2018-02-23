package Lista3.zadanie23;

import java.util.Scanner;

public class Zellers {

	public static double zellerFormula(int dayOfTheMonth, int month, int year) {

		if (month == 1) {
			month = 13;
			year--;
		}
		
		if (month == 2) {
			month = 14;
			year--;
		}
		
		double j = year/100; 	// century
		int k = year%100;		// year of the century
		
		double dayOfTheWeek = (dayOfTheMonth + (26 * (month + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
	
		return dayOfTheWeek;
	}

	public static void dDay(int day) {
		switch (day) {
		case 0:
			System.out.println("Sobota");
			break;
		case 1:
			System.out.println("Niedziela");
			break;
		case 2:
			System.out.println("Poniedzia�ek");
			break;
		case 3:
			System.out.println("Wtorek");
			break;
		case 4:
			System.out.println("�roda");
			break;
		case 5:
			System.out.println("Czwartek");
			break;
		case 6:
			System.out.println("Pi�tek");
			break;
		default:
			System.out.println("B��d");
			break;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year;
		int month;
		int day;
		
		System.out.println("Podaj dzie�, miesi�c i rok D M YYYY");
		day = scan.nextInt();
		month = scan.nextInt();
		year = scan.nextInt();
		
		int dayOfTheWeek = (int)zellerFormula(day, month, year);
		System.out.println(dayOfTheWeek);
		dDay(dayOfTheWeek);
		
		scan.close();
	}
}
