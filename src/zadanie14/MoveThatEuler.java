package zadanie14;

import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.ThreadLocalRandom;

public class MoveThatEuler {

//	public static int[] getHeaviest(ArrayList<Integer> weightOfItems) {
//		int[] heavy = new int[2];
//		
//		heavy[0] = weightOfItems.get(0); //weight
//		heavy[1] = 0;					//index
//
//		for (int i = 0; i < weightOfItems.size(); i++) {
//			if (weightOfItems.get(i) > heavy[0]) {
//				heavy[0] = weightOfItems.get(i);
//				heavy[1] = i;
//			}
//		}
//
//		return heavy;
//	}
//
//	public static int[] getLowest(ArrayList<Integer> weightOfItems) {
//		int[] light = new int[2];
//		
//		light[0] = weightOfItems.get(0); //weight
//		light[1] = 0;					//index
//
//		for (int i = 0; i < weightOfItems.size(); i++) {
//			if (weightOfItems.get(i) < light[0]) {
//				light[0] = weightOfItems.get(i);
//				light[1] = i;
//			}
//		}
//
//		return light;
//	}
//	
//	public static int[] getMatching(ArrayList<Integer> weightOfItems, int desiredMaxWeight) {
//		int currentHeaviest = getHeaviest(weightOfItems)[1];
//
//		int[] matching = new int[2];
//		
//		for(int i = 0; i < weightOfItems.size(); i++) {
//			if((currentHeaviest + weightOfItems.get(i)) == desiredMaxWeight) {
//				matching[0] = weightOfItems.get(i);
//				matching[1] = i;
//				
//				return matching;
//			}
//			else return getMatching(weightOfItems, desiredMaxWeight - 1);
//		}
//	}
//
//	public static void main(String[] args) {
//		int collectionCount = 0;
//		int maxWeightInBox = 0;
//
//		collectionCount = ThreadLocalRandom.current().nextInt(16, 31);
//		maxWeightInBox = 20;
//		ArrayList<Integer> weightOfItems = new ArrayList<Integer>();
//
//		Stack<Box> boxStack = new Stack<Box>();
//
//		for (int i = 0; i < collectionCount; i++) {
//			weightOfItems.add(ThreadLocalRandom.current().nextInt(1, maxWeightInBox+1));
//		}
//
//		for (int i = 0; i < weightOfItems.size(); i++) {
//			System.out.print(weightOfItems.get(i) + " ");
//		}
//
////		while (!weightOfItems.isEmpty()) {
////			Box newBox = new Box();
////			newBox.setWeightInBox(getHeaviest(weightOfItems)[0]);
////			
////			while (newBox.getWeightInBox() <= 20) {
////				if(newBox.getWeightInBox() < 20) {
////					newBox.addWeight(getMatching(weightOfItems, maxWeightInBox)[0]);
////					weightOfItems.remove(getMatching(weightOfItems, maxWeightInBox)[1]);	
////				}
////			} 
//		//			
////			weightOfItems.remove(getHeaviest(weightOfItems)[1]);
////			
////			boxStack.add(newBox);
////		}
//
//	}
}
