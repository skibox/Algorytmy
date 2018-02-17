//package Projekty.Statki;
//
//import java.util.Random;
//
//public class StatkiDemo {
//	public static final int FOURS 	= 1;
//	public static final int THREES 	= 2;
//	public static final int TWOS 	= 3;
//	public static final int ONES 	= 4;
//	
//	public static int[][] cpuFill(int[][] empty){
//		Random rand = new Random();
//		
//		int[][] filled = empty;
//		int shipAmount 		= ONES + TWOS + THREES + FOURS;
//		int foursCounter 	= 0;
//		int threesCounter 	= 0;
//		int twosCounter 	= 0;
//		int onesCounter 	= 0;
//		
//		for (foursCounter = 0; foursCounter < FOURS; foursCounter++) {
//			int xStart = rand.nextInt(10);
//			int yStart = rand.nextInt(10);
//			int way = rand.nextInt(4);
//			
//			switch (way) {
//				case 0: //UP
//					
//					break;
//				case 1: //DOWN
//					
//					break;
//				case 2: //LEFT
//					
//					break;
//				case 3: //RIGHT
//					
//					break;
//				default:
//					break;
//			}
//			try {
//				
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
//
//		return filled;
//	}
//	
//	public static void main(String[] args) {
//		int[][] cpuShips 			= new int[10][10];
//		boolean[][] cpuGuesses	 	= new boolean[10][10];
//		boolean[][] humanShips 		= new boolean[10][10];
//		boolean[][] humanGuesses 	= new boolean[10][10];
//		
//		
//	}
//}
