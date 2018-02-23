package Lista4.zadanie8;


import java.util.Scanner;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) {
		if(checkDay(day)) setDay(changeDay());
		else setDay(day);
		
		if(checkMonth(month)) setMonth(changeMonth());
		else setMonth(month);
		
		if(checkYear(year)) setYear(changeYear());
		else setYear(year);
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setDate(int day, int month, int year) {
		if(checkDay(day)) setDay(changeDay());
		else setDay(day);
		
		if(checkMonth(month)) setMonth(changeMonth());
		else setMonth(month);
		
		if(checkYear(year)) setYear(changeYear());
		else setYear(year);
	}

	public boolean checkDay(int day) {
		if ((day <= 0) || (day >= 32)) {
			System.err.println("B��dny dzie�");
			return true;
		} else
			return false;
	}

	public int changeDay() {
		boolean end = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj nowy dzien: ");
		int newDay = scan.nextInt();

		while (!end) {
			if (checkDay(newDay)) {
				newDay = changeDay();
			} else
				end = true;
		}
		return newDay;
	}

	public boolean checkMonth(int month) {
		if (month < 1 || month > 12) {
			System.err.println("B��dny miesi�c");
			return true;
		} else
			return false;
	}

	public int changeMonth() {
		boolean end = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj nowy miesi�c: ");
		int newMonth = scan.nextInt();

		while (!end) {
			if (checkMonth(newMonth)) {
				newMonth = changeMonth();
			} else
				end = true;
		}
		return newMonth;
	}

	public boolean checkYear(int year) {
		if (year < 1900 || year > 9999) {
			System.err.println("B��dny rok");
			return true;
		} else
			return false;
	}

	public int changeYear() {
		boolean end = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj nowy rok: ");
		int newYear = scan.nextInt();

		while (!end) {
			if (checkYear(newYear)) {
				newYear = changeYear();
			} else
				end = true;
		}
		return newYear;
	}

	@Override
	public String toString() {
		if (getDay() < 10 && !(getMonth() < 10))
			return "0" + getDay() + "/" + getMonth() + "/" + getYear();
		else if(getDay() < 10 && (getMonth() < 10))
			return "0" + getDay() + "/0" + getMonth() + "/" + getYear();
		else if(!(getDay() < 10) && (getMonth() < 10))
			return getDay() + "/0" + getMonth() + "/" + getYear();
		else
			return getDay() + "/" + getMonth() + "/" + getYear();
	}
}
