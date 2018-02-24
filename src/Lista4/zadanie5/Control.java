package Lista4.zadanie5;


import java.util.Scanner;

public class Control {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj dwa boki prostok�ta: ");
		float sideA = scan.nextFloat();
		float sideB = scan.nextFloat();
		scan.nextLine();
		
		Rectangle rectangle1 = new Rectangle(sideA, sideB);
		
		System.out.println(rectangle1.toString());
		scan.close();
	}
}
