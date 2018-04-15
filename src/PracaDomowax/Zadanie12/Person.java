package PracaDomowax.Zadanie12;

public class Person {
	private String firstName;
	private String lastName;
	private String PESEL;
	private char gender;
	private BirthDay birthDay;
	
	public Person(String firstName, String lastName, String PESEL) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.PESEL = PESEL;
		
		birthDay = new BirthDay(PESEL);
		this.gender = birthDay.getGender(PESEL);
	}

	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPESEL() {
		return PESEL;
	}


	public void setPESEL(String pESEL) {
		PESEL = pESEL;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public BirthDay getBirthDay() {
		return birthDay;
	}


	public void setBirthDay(BirthDay birthDay) {
		this.birthDay = birthDay;
	}

	public long daysFromBirthDay() {
		return birthDay.daysAlive();
	}
	
	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		output.append("Imi�: ").append(firstName).append(", Nazwisko: ").append(lastName).append(", PESEL: ").append(PESEL)
		.append(", Data urodzenia: ").append(birthDay).append(", P�e�: ").append(gender);
		
		return output.toString();
	}
	
	
}
