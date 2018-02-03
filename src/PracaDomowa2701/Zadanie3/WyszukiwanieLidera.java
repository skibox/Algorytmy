package PracaDomowa2701.Zadanie3;

public class WyszukiwanieLidera {
	public static void main(String[] args) {
		String input = "[1,2,2,3,13,11,10,6,2,5,5,5,5,5,4,3,2,1,6,2]";

		String[] inputSplit = input.substring(input.indexOf("[") + 1, input.indexOf("]")).split(",");
		int[] val = new int[inputSplit.length];

		for (int i = 0; i < val.length; i++) {
			val[i] = Integer.parseInt(inputSplit[i]);
		}

		int maxNumber = val[0];
		for (int i = 0; i < val.length - 1; i++) {
			if (val[i] > maxNumber) {
				maxNumber = val[i];
			}
		}

		int[] countArr = new int[maxNumber + 1];
		for (int i = 0; i < val.length - 1; i++) {
			countArr[val[i]]++;
		}

		int leaderNumber = 0;
		int leaderIndexNumber = 0;
		for (int i = 0; i < countArr.length; i++) {
			if (countArr[i] > leaderNumber) {
				leaderIndexNumber = i;
				leaderNumber = countArr[i];
			}
		}
		
		for (int i = 0; i < countArr.length; i++) {
			System.out.printf("i: %d = %d \n", i, countArr[i]);
		}
		
		System.out.println("Leader = " + leaderIndexNumber);

	}
}
