package Zajecia1003.Kolekcje.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Demo {
	public static void main(String[] args) {
		Comparator<Person> comparator = new PersonComparator();
		PriorityQueue<Person> queue = new PriorityQueue<Person>(comparator);
		
		queue.offer(new Person("Ania", false));
		queue.offer(new Person("Daniel", false));
		queue.offer(new Person("Kasia", true));
		queue.offer(new Person("Agata", false));
		queue.offer(new Person("Agnieszka", true));
		queue.offer(new Person("Tomasz", false));
		queue.offer(new Person("Jadwiga", true));
		queue.offer(new Person("Agata", false));

	
		for(Person person : queue)
			System.out.println(person.getName() + " " + person.isPregnant());
	}
}
