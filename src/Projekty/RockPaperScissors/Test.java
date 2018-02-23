package Projekty.RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char userMove;
		boolean end = false;
		
		int userPoints = 0;
		int cpuPoints = 0;
		
		System.out.printf("%19s\n","Game   start");
		System.out.println("====YOU==== | ====CPU====");
		System.out.println("----------- | -----------");
		
		while(!end) {
			userMove = scan.nextLine().charAt(0);
			
			if(userMove == FigureType.QUIT.getState()) {
				end = true;
				break;
			}
			
			String tempUserMove = nextUserMove(userMove).toString();
			String tempCpuMove = nextCPUMove().toString();
			
			if (tempCpuMove == "PAPER" 		&& tempUserMove == "ROCK") cpuPoints++;
			if (tempCpuMove == "PAPER" 		&& tempUserMove == "SCISSORS") userPoints++;
			if (tempCpuMove == "ROCK" 		&& tempUserMove == "SCISSORS") cpuPoints++;
			if (tempCpuMove == "ROCK" 		&& tempUserMove == "PAPER") userPoints++;
			if (tempCpuMove == "SCISSORS" 	&& tempUserMove == "PAPER") cpuPoints++;
			if (tempCpuMove == "SCISSORS" 	&& tempUserMove == "ROCK") userPoints++;
			
			System.out.printf("%11s | %11s", tempUserMove, tempCpuMove);
			
		}
		System.out.println();
		System.out.printf("%17s\n","Game   end");
		System.out.println("----------- | -----------");
		System.out.printf("%11s | %11s", String.valueOf(userPoints), String.valueOf(cpuPoints));
		scan.close();
	}
	
	
	public static FigureType nextUserMove(char choose) {
		return FigureType.getValueBasedOnChar(choose);
	}
	
	public static FigureType nextCPUMove() {
		Random rand = new Random();
		int move = rand.nextInt(3);
		
		switch (move) {
		case 0:
			return FigureType.ROCK;
		case 1:
			return FigureType.PAPER;
		case 2:
			return FigureType.SCISSORS;
		default:
			return FigureType.ROCK;
		}
	}
}
