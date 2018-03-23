package Zajecia1003.Kolekcje.Queue;

public class Person{
	private boolean pregnant;
	private String name;

	public Person(String name, boolean pregnant) {
		this.name = name;
		this.pregnant = pregnant;
	}
	
	public boolean isPregnant() {
		return pregnant;
	}

	public void setPregnant(boolean pregnant) {
		this.pregnant = pregnant;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	
}
