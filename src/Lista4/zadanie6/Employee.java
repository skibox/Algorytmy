package Lista4.zadanie6;


import java.util.Scanner;

public class Employee {

	int id;
	int salary;
	String firstName;
	String lastName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
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

	public Employee(int id, int salary, String firstName, String lastName) {
		if (checkId(id))
			setId(changeId());
		else
			setId(id);

		if (checkFirstName(firstName) && checkLastName(lastName)) {
			setFirstName(changeFirstName());
			setLastName(changeLastName());
		} else if (!checkFirstName(firstName) && checkLastName(lastName)) {
			setFirstName(firstName);
			setLastName(changeLastName());
		} else if (checkFirstName(firstName) && !checkLastName(lastName)) {
			setFirstName(changeFirstName());
			setLastName(lastName);
		} else {
			setFirstName(firstName);
			setLastName(lastName);
		}

		if (checkSalary(salary))
			setSalary(changeSalary());
		else
			setSalary(salary);
	}

	public boolean checkId(int id) {
		if (id <= 0) {
			System.err.println("B��dne ID.");
			return true;
		} else
			return false;
	}

	public int changeId() {
		boolean end = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj nowe ID: ");
		int newID = scan.nextInt();

		while (!end) {
			if (checkId(newID)) {
				newID = changeId();
			} else
				end = true;
		}
		return newID;
	}

	public boolean checkFirstName(String firstName) {
		if (firstName.length() == 0) {
			System.err.println("B��dne imi�");
			return true;
		} else
			return false;
	}

	public String changeFirstName() {
		boolean end = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj nowe imi�: ");
		String newFirstName = scan.nextLine();

		while (!end) {
			if (checkFirstName(newFirstName)) {
				newFirstName = changeFirstName();
			} else
				end = true;
		}
		return newFirstName;
	}

	public boolean checkLastName(String lastName) {
		if (lastName.length() == 0) {
			System.err.println("B��dne nazwisko");
			return true;
		} else
			return false;
	}

	public String changeLastName() {
		boolean end = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj nowe nazwisko: ");
		String newLastName = scan.nextLine();

		while (!end) {
			if (checkLastName(newLastName)) {
				newLastName = changeLastName();
			} else
				end = true;
		}
		return newLastName;
	}

	public boolean checkSalary(int oldSalary) {
		if (oldSalary <= 0) {
			System.err.println("B��dne zarobki");
			return true;
		} else
			return false;
	}

	public int changeSalary() {
		boolean end = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj nowe zarobki: ");
		int newSalary = scan.nextInt();

		while (!end) {
			if (checkSalary(newSalary)) {
				newSalary = changeSalary();
			} else
				end = true;
		}
		return newSalary;
	}

	public String name() {
		return getFirstName() + " " + getLastName();
	}

	public int getAnnualSalary() {
		return 12 * getSalary();
	}

	public int raiseSalary(int percent) {

		double newSalary = getSalary() + getSalary() * ((double) percent / 100);
		setSalary((int) (newSalary));
		return getSalary();
	}

	@Override
	public String toString() {
		return "Employee[id = " + getId() + ", name = " + getFirstName() + ", lastname = " + getLastName()
				+ ", salary = " + getSalary();
	}
}
