package Zajecia0303.zadanie1.SposobySortowania;

public class BubbleSort implements SortInterface {
	@Override
	public int[] sort(int[] input) {
		int n = input.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (input[j - 1] > input[j]) {
					temp = input[j - 1];
					input[j - 1] = input[j];
					input[j] = temp;
				}
			}
		}
		return input;
	}
}
