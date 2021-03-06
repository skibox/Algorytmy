package Zajecia0303.zadanie1.SposobySortowania;

public class InsertionSort implements SortInterface {
	@Override
	public int[] sort(int[] input) {
		int key, j;
		for (int i = 0; i < input.length; i++) {
			j = i;
			key = input[i];

			while (j > 0 && input[j - 1] > key) {
				input[j] = input[j - 1];
				j--;
			}
			input[j] = key;
		}
		return input;
	}
}
