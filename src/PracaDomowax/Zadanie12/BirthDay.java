package app;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class BirthDay {
	private int day;
	private int month;
	private int year;

	public BirthDay(String PESEL) {
		this.year = 1900 + Integer.parseInt(PESEL.substring(0, 2));
		this.month = Integer.parseInt(PESEL.substring(2, 4));
		this.day = Integer.parseInt(PESEL.substring(4, 6));
	}

	public BirthDay(int day, int month, int year) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public char getGender(String PESEL) {
		int genderCheck;
		genderCheck = (int) (PESEL.charAt(9) - '0');

		if (genderCheck % 2 != 0)
			return 'M';
		else if (genderCheck % 2 == 0)
			return 'K';
		else
			return 'e';
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

	public long daysAlive() {
		Calendar calendar = Calendar.getInstance();

		int currentDay = LocalDateTime.now().getDayOfMonth();
		int currentMonth = LocalDateTime.now().getMonthValue();
		int currentYear = LocalDateTime.now().getYear();

		calendar.set(currentYear, currentMonth, currentDay);
		Date firstDate = calendar.getTime();
		calendar.set(this.year, this.month, this.day);
		Date secondDate = calendar.getTime();
		long elapsedDays = firstDate.getTime() - secondDate.getTime();

		return elapsedDays / 1000 / 60 / 60 / 24;
	}

	@Override
	public String toString() {
		return "[" + day + "." + month + "." + year + "]";
	}
}
