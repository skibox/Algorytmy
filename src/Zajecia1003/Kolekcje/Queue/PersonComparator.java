package Zajecia1003.Kolekcje.Queue;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{

	@Override
	public int compare(Person person1, Person person2) {
		if(person1.isPregnant() && !person2.isPregnant())
			return -1;
		else if(!person1.isPregnant() && person2.isPregnant())
			return 1;
		else return 0;
			
	}
}
