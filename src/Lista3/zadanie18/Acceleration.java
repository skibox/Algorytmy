package Lista3.zadanie18;

import java.util.Scanner;

public class Acceleration {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double initialVelocity = 0;
		double finalVelocity = 0;
		double time = 0;
		
		System.out.println("Podaj pr�dko�� pocz�tkow� [m/s]: ");
		initialVelocity = scan.nextDouble();
		
		System.out.println("Podaj pr�dko�� ko�cow� [m/s]: ");
		finalVelocity = scan.nextDouble();
		
		System.out.println("Podaj czas podr�y [s]: ");
		time = scan.nextDouble();
		
		double averageAcceleration = (finalVelocity - initialVelocity) / time;
		
		System.out.printf("�rednie przyspieszenie wynosi %.2f [m/s^2]", averageAcceleration);
		scan.close();
	}
}
