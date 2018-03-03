package Zajecia0303.zadanie1;

import Zajecia0303.zadanie1.SposobySortowania.BubbleSort;

public class DaneDoBabelkow extends Sorter {
	int[] input;

	public DaneDoBabelkow(int[] input) {
		this.input = input;
		sortInterface = new BubbleSort();
	}

	public DaneDoBabelkow() {
		sortInterface = new BubbleSort();
	}
}
