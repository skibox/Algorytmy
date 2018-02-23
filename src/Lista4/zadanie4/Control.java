package Lista4.zadanie4;


import java.util.Scanner;

public class Control {
	public static void main(String[] args) {
	
//		Circle circle1 = new Circle();
//		System.out.println("Circle1: " + circle1.toString());
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj promie� okr�gu: ");
		double radius = scan.nextDouble();
		scan.nextLine();
		
		Circle circle2 = new Circle(radius);
		System.out.println("Circle2: " + circle2.toString());
		
		scan.close();
	}
}
