package app;

public class Test {
	public static void main(String[] args) {
		Person student1 = new Student("Jan Kowalski", "Jaracza 2/4", "AiR", 2010, 2500.0);
		Person staff1 = new Staff("Oksana", "Nowowiejska 6/10", "PWr", 2200);
		Person person1 = new Person("Adrzej Ska³a", "Dubois 40/10");
		
		System.out.println(student1);
		System.out.println(staff1);
		System.out.println(person1);
	}
}
