package Zajecia1003.Kolekcje.ArrayList;

import java.util.Arrays;
import java.util.List;

public class Zadanie1 {
	public static void main(String[] args) {
		int[] primitives = new int[10];
		Integer[] wrappers = new Integer[10];
		
		for (int i = 0; i < primitives.length; i++) {
			primitives[i] = i;
			wrappers[i] = Integer.valueOf(i);
		}
		
		List<int[]> arr1 = Arrays.asList(primitives);
		List<Integer> arr2 = Arrays.asList(wrappers);
		System.out.println();
	}
}
