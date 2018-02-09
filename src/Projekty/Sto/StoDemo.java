package Projekty.Sto;

import java.util.Random;
import java.util.Scanner;

public class StoDemo {
	
	public static int humanMove() {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		scan.nextLine();
		
		return x;
	}
	
	public static int cpuRandomMove() {
		Random rand = new Random();
		int x = 1 + rand.nextInt(9);
		return x;
	}
	
	public static int cpuAlwaysWinningMove(int currentSum) {
		int[] possibleMoves = {1,2,3,4,5,6,7,8,9,10};
		int move = 0;
		if ((currentSum - 10) > 13) {
			int i = 0;
			while(currentSum - possibleMoves[i] != 12) {
				move = possibleMoves[i];
				i++;
			}  
			
			return move;
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
		
		while (true) {
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
		}
	}
}
