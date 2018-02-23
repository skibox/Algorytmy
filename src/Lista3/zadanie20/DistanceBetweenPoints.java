package Lista3.zadanie20;

import java.util.Scanner;

public class DistanceBetweenPoints {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x1, x2, y1, y2;

		System.out.println("Podaj wsp�rz�dne pierwszego punktu: ");
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		System.out.println("Podaj wsp�rz�dne drugiego punktu: ");
		x2 = scan.nextDouble();
		y2 = scan.nextDouble();

		double distanceBetweenPoints =
			   Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2));
		
		System.out.printf("Odleg�o�� pomi�dzy punktami [%.1f;%.1f] i [%.1f;%.1f] wynosi %.1f", x1, y1, x2, y2, distanceBetweenPoints);
		scan.close();
	}
}
