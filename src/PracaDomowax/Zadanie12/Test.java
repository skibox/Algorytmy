package app;

public class Test {
	public static void main(String[] args) {
		Person person1 = new Person("Jan", "Kowalski", "88030201530");
		System.out.println(person1);
		Person person2 = new Person("Anna", "Kowalska", "90021508220");
		System.out.println(person2);
		
		System.out.println("Jan ¿yje " + person1.daysFromBirthDay() + " dni.");
	}
}
