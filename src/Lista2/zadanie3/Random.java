package Lista2.zadanie3;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Random {

	public static void main(String[] args) {

		int random = ThreadLocalRandom.current().nextInt(0,10);
		Scanner scan = new Scanner(System.in);
		boolean end = false;
		int choice = 0;
		
		while(!end) {
			System.out.println("Podaj cyfr� 0-9");
			choice = scan.nextInt();
			scan.nextLine();
			
			if(choice > random) 
				System.out.println("Cyfra jest zbyt du�a!");
			
			else if (choice < random) 
				System.out.println("Cyfra jest zbyt ma�a!");
			
			else {
				System.out.println("Gratulacje.");
				scan.close();
				end = true;
			}
		}
		
	}
}
