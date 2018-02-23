package Lista5.zadanie1;

import java.util.Scanner;

public class Easter {
	public static void main(String[] args) {
		double a, b, c, d, e, f, g, h, i, k, l, m, p;
		double year, month, day;

		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj rok: ");
		year = scan.nextInt();
		scan.nextLine();

		a = year % 19;
		b = Math.floor(year / 100);
		c = year % 100;
		d = Math.floor(b / 4);
		e = b % 4;
		f = Math.floor((b + 8) / 25);
		g = Math.floor((b - f + 1) / 3);
		h = (19 * a + b - d - g + 15) % 30;
		i = Math.floor(c / 4);
		k = c % 4;
		l = (32 + 2 * e + 2 * i - h - k) % 7;
		m = Math.floor((a + 11 * h + 22 * l) / 451);
		p = (h + l - 7 * m + 114) % 31;

		day = p + 1;
		month = Math.floor((h + l - 7 * m + 114)/31);
		
		if (month == 3.0) System.out.println((int)day + " marca " + (int)year);
		else System.out.println((int)day + " kwietnia " + (int)year);
		
		scan.close();
	}
}
