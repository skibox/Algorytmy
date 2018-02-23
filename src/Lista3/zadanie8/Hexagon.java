package Lista3.zadanie8;

import java.util.Scanner;


public class Hexagon {
	public static double radius(double size) {
		return size * Math.sqrt(3) / 2;
	}

	public static double area(double size) {
		return Math.pow(size, 2) * Math.sqrt(3) / 4;
	}

	public static double circ(double size) {
		return 6 * size;
	}

	public static double shorterDiagonal(double size) {
		return 2 * radius(size);
	}

	public static double longerDiagonal(double size) {
		return 2 * size;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double size;

		System.out.println("Podaj bok sze�ciok�ta: ");
		size = scan.nextDouble();

		System.out.printf(
				"Sze�ciok�t. \n "
			  + "Bok = %.2f, Pole = %.2f, Obw�d = %.2f, "
	     	  + "kr�tsza przek�tna = %.2f, d�u�sza przek�tna = %.2f, promie� okr�gu wpisanego = %.2f",
				size, area(size), circ(size), shorterDiagonal(size), longerDiagonal(size), radius(size));

		scan.close();
	}
}
