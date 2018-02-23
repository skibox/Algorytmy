package Projekty.Sto;

import java.util.Random;
import java.util.Scanner;

public class StoDemo {
	
	public static int humanMove() {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		scan.nextLine();
		scan.close();
		return x;
	}
	
	public static int cpuRandomMove() {
		Random rand = new Random();
		int x = 1 + rand.nextInt(9);
		return x;
	}
	
	//do skonczenia
	
	public static int cpuAlwaysWinningMove(int currentSum) {
		int[] possibleMoves = {1,2,3,4,5,6,7,8,9,10};
		int move = 0;
		if (currentSum < 23 && currentSum > 11) {
			return currentSum - 12;
		}
		
		else if(currentSum < 12) {
			return currentSum;
		}
		
		else {
			Random rand = new Random();
			move = possibleMoves[rand.nextInt(9)];
			return move;
		}
	}
	
	public static void main(String[] args) {
		int sum = 100;
		int cpu = 0;
		
		
		while (sum != 0 || sum != 1) {
			System.out.println("Sum: " + sum);
			sum -= humanMove();
			if(sum < 2) {
				System.out.println("Human wins!");
				break;
			}
			cpu = cpuAlwaysWinningMove(sum);
			sum -= cpu;

			System.out.println("cpumove: " + cpu);
			System.out.println("Sum: " + sum);
			System.out.println("===============");
			
			if(sum < 2) {
				System.out.println("cpu wins!");
				break;
			}
		}
	}
}
