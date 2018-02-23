package Lista2.zadanie2;

import java.lang.Math;
import java.util.Scanner;

public class OrbPI {
	
	public static double OrbVolume(double r) {
		return 4*Math.PI*Math.pow(r, 3)/3;
	}
	
	public static void main(String[] args) {
		System.out.printf("Warto�� PI, dok�adno�� do 5 miejsc: %.5f\n", Math.PI);

		System.out.printf("Warto�� pierwiastka z PI, dok�adno�� do 2 miejsc: %.2f\n", Math.sqrt(Math.PI));
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj promie� kuli: ");
		double volume = scan.nextDouble();		
		scan.nextLine();
		
		System.out.printf("Obj�to�� kuli o podanym promieniu to %.2f\n", OrbVolume(volume));
		scan.close();
	}

}
