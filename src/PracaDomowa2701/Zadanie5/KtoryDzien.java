package PracaDomowa2701.Zadanie5;

import java.util.GregorianCalendar;

public class KtoryDzien {
	public static boolean isLeapYear(int year) {
		return ((year%4 == 0 && year%100 != 0) || year%400 == 0);
	}
	
	public static void main(String[] args) {
		System.out.println("Podaj dzień: ");
		String date = "21 01 2017";
		GregorianCalendar gCalendar = new GregorianCalendar();
		
		int day 	= Integer.parseInt(date.substring(0,2));
		int month 	= Integer.parseInt(date.substring(3, 5));
		int year 	= Integer.parseInt(date.substring(6, date.length()));
		
		gCalendar.set(GregorianCalendar.DAY_OF_MONTH, day);
		gCalendar.set(GregorianCalendar.MONTH, month);
		gCalendar.set(GregorianCalendar.YEAR, year);
		
		System.out.printf("%d %d %d\n", day, month, year);
		System.out.println(gCalendar.get(GregorianCalendar.DAY_OF_YEAR));
		// ?
	}
	
	
}
