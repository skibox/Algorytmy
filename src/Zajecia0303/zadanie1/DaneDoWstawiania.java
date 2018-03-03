package Zajecia0303.zadanie1;

import Zajecia0303.zadanie1.SposobySortowania.InsertionSort;

public class DaneDoWstawiania extends Sorter {
	int[] input;

	public DaneDoWstawiania(int[] input) {
		this.input = input;
		sortInterface = new InsertionSort();
	}

	public DaneDoWstawiania() {
		sortInterface = new InsertionSort();
	}
}
