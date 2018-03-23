package Zajecia1003.Kolekcje.Set;

import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		TreeSet<String> treeSet1 = new TreeSet<>();
		TreeSet<String> treeSet2 = new TreeSet<>();
		
		treeSet1.add("Nowak");
		treeSet1.add("Kowalski");
		treeSet1.add("Wiśniewski");
		treeSet1.add("Wójcik");
		treeSet1.add("Kowalczyk");
		
		treeSet2.add("Wójcik");
		treeSet2.add("Nogalski");
		treeSet2.add("Lewandowski");
		treeSet2.add("Górniak");
		treeSet2.add("Tokarski");
		treeSet2.add("Kowalczyk");
		
		TreeSet<String> treeSet1Copy = new TreeSet<>(treeSet1);
		
		treeSet1Copy.retainAll(treeSet2);
		for(String surname : treeSet1)
			System.out.println(surname);
		
		System.out.println();
		System.out.println(treeSet1.ceiling("Lebioda"));
		System.out.println();
		
		for(String surname : treeSet1.descendingSet())
			System.out.println(surname);
	}
}
