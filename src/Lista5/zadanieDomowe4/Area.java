package Lista5.zadanieDomowe4;

import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int taskCount;
		
		System.out.println("Podaj liczbe zestawow: ");
		taskCount = scan.nextInt();
		scan.nextLine();
		int[] stepsCount = new int[taskCount];
		
		System.out.println("Podaj liczbe krokow: ");
		for (int i = 0; i < stepsCount.length; i++) {
			stepsCount[i] = scan.nextInt();
			scan.nextLine();
		}
		
		System.out.println("Powierzchnia dzialki: ");
		for (int i = 0; i < stepsCount.length; i++) {
			System.out.println(Math.pow(stepsCount[i], 2));
		}
		
		scan.close();
		
	}
}
