package PracaDomowa1702.zadanie1;

public class Duplicates {
	public static void main(String[] args) {
		int[] inputArray = {2,2,3,1,5};
		
		int duplicateTemp = 0;
		int firstOccuranceIndex = 0;
		int secondOccuranceIndex = 0;
		boolean end = false;
		
		for (int i = 0; i < inputArray.length; i++) {
			duplicateTemp = inputArray[i];
			firstOccuranceIndex = i;
			for (int j = i + 1; j < inputArray.length; j++) {
				if(duplicateTemp == inputArray[j]) {
					secondOccuranceIndex = j;
					end = true;
					break;
				}	
			}
			if(end) break;
		}
		
		if(secondOccuranceIndex != 0) System.out.printf("%d: (%d,%d)", duplicateTemp,firstOccuranceIndex,secondOccuranceIndex);
		else System.out.println("Array doesn't have two identical values");
	}
}
