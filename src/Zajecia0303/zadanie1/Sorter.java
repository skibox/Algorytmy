package Zajecia0303.zadanie1;

import Zajecia0303.zadanie1.SposobySortowania.SortInterface;

public abstract class Sorter {
	protected SortInterface sortInterface;

	public void setSortInterface(SortInterface sortInterface) {
		this.sortInterface = sortInterface;
	}

	public int[] sortArray(int[] input) {
		return sortInterface.sort(input);
	}

	public void printArray(int[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.printf("%d ", input[i]);
		}
	}
}
