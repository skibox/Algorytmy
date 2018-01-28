package zadanie14;

import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;

public class MoveThatEuler {
	public static class Box{
		int itemCounter;
		int weightInBox;
		
		public Box() {
			itemCounter = 0;
			weightInBox = 0;
		}
	}
	public static void getTheMost(int[] inputArray) {
		
	}
	public static void main(String[] args) {
		int collectionCount = 0;
		int maxWeight = 0;
		Stack<Box> boxStack = new Stack<Box>();
		
		collectionCount = ThreadLocalRandom.current().nextInt(16,31);
		maxWeight = 20;
		int[] numberOfItems = new int[collectionCount];
		
		for (int i = 0; i < numberOfItems.length; i++) {
			numberOfItems[i] = ThreadLocalRandom.current().nextInt(1,21);
		}
		
		for (int i = 0; i < numberOfItems.length; i++) {
			System.out.println(numberOfItems[i]);
		}
		
		Arrays.sort(numberOfItems);
		System.out.println();
		
		for (int i = 0; i < numberOfItems.length; i++) {
			System.out.println(numberOfItems[i]);
		}
		

	}
}
