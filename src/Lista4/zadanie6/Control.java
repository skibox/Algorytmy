package Lista4.zadanie6;


import java.util.Scanner;

public class Control {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Podaj ID pracownika: ");
		int id = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Podaj imi� pracownika: ");
		String firstName = scan.nextLine();
		
		System.out.println("Podaj nazwisko pracownika: ");
		String lastName = scan.nextLine();
		
		System.out.println("Podaj zarobki pracownika: ");
		int salary = scan.nextInt();
		scan.nextLine();
		
		Employee employee = new Employee(id, salary, firstName, lastName);
		System.out.println(employee.toString());
		
		employee.raiseSalary(50);
		System.out.println(employee.toString());
	}
}
