package Lista4.zadanie2;


public class Author {
	private String firstName;
	private String lastName;
	private String homeland;

	public Author() {
		
	}
	
	public Author(String firstName, String lastName, String homeland) {
		setFirstName(firstName);
		setLastName(lastName);
		setHomeland(homeland);
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

	public String getHomeland() {
		return homeland;
	}

	public void setHomeland(String homeland) {
		this.homeland = homeland;
	}

}
