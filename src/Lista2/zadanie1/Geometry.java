package Lista2.zadanie1;

import java.util.Scanner;

public class Geometry {

	public static void menu() {
		System.out.println("1.Obliczanie pola\n" + "2.Obliczanie obwodu\n" + "3.Pole okr�gu wpisanego w prostok�t\n"
				+ "4.Pole kwadratu wpisanego w okr�g\n5.Wprowadzenie warto�ci zmiennych\n0.Wyj�cie z programu");
	}

	public static double RectangleArea(double a, double b) {
		return a * b;
	}

	public static double RectanglePerimeter(double a, double b) {
		return 2 * a + 2 * b;
	}

	public static double InscribedCircleArea(double a, double b) {
		return Math.PI * a * a / 4;
	}

	public static double InscribedSquareArea(double r) {
		return r * r / 2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int menu = 0;
		double a = 0;
		double b = 0;
		double r = 0;
		boolean end = false;

		menu();

		while (!end) {
			System.out.println("Wybierz akcj�: ");
			menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				System.out.println("Pole prostok�ta to: " + RectangleArea(a, b));
				break;
			case 2:
				System.out.println("Obw�d prostok�ta to: " + RectanglePerimeter(a, b));
				break;
			case 3:
				if (a != b) {
					System.out.println("Okr�gu nie da si� wpisa� w podany czworok�t.");
					break;
				}
				System.out.println("Pole okr�gu wpisanego w czworok�t to: " + InscribedCircleArea(a, b));
				break;
			case 4:
				System.out.printf("Podaj promie� okr�gu: ");
				r = sc.nextDouble();
				sc.nextLine();
				System.out.println();
				System.out.println("Pole kwadratu wpisanego w okr�g to: " + InscribedSquareArea(r));
				break;
			case 5:
				System.out.println("Podaj d�ugo�ci bok�w: ");
				System.out.printf("A = ");
				a = sc.nextDouble();
				sc.nextLine();
				System.out.printf("B = ");
				b = sc.nextDouble();
				sc.nextLine();
				break;
			case 0:
				System.out.println("Koniec dzia�ania.");
				end = true;
				sc.close();
				break;
			default:
				System.out.println("Taka akcja nie istnieje.");
				break;
			}
		}

	}

}
