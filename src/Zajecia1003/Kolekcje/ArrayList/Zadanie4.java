package Zajecia1003.Kolekcje.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Zadanie4 {
	public static void main(String[] args) {
		Integer[] wrappers = new Integer[10];
		
		for (int i = 0; i < 10; i++) {
			wrappers[i] = i;
		}
		
		List<Integer> arr1 = Arrays.asList(wrappers);
		
		List<Integer> arr2 = new ArrayList<Integer>(arr1);
		Collections.reverse(arr2);
		
		arr2.addAll(arr1);
		for (Integer toClone : arr2) System.out.println(toClone);
	}
}
