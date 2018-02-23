package Lista5.zadanie13;

import java.util.Scanner;

public class PregnancyPeriod {
	public static void main(String[] args) {

		int D, X, Y, Z;
		double M;
		Scanner scan = new Scanner(System.in);

		System.out.println("Podaj ilosc prob: ");
		D = scan.nextInt();
		scan.nextLine();
		System.out.println();
		
		for(int i = 0; i < D; i++) {
			System.out.println("X lat starsza/Za Y lat/Z razzy mlodsze.");
			X = scan.nextInt();
			Y = scan.nextInt();
			Z = scan.nextInt();
			scan.nextLine();
	
			System.out.printf(
					"Matka jest o %d lat starsza od dziecka. Za %d lat dziecko bedzie %d razy mlodsze od matki.\n\n",
					X, Y, Z);
	
			M = -12 * ((((double)Y * Z) - X - Y) / (1 - Z));
			
			System.out.printf("Ciaza w tym gatunku trwa %.0f miesiecy.", M);
			scan.close();
		}
	}
}
