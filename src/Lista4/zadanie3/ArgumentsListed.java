package Lista4.zadanie3;


import java.util.Scanner;
import java.util.Stack;

public class ArgumentsListed {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		int height;
		int weight;
		
		boolean end = false;
		Stack<Parameter> arguments = new Stack<Parameter>();
		
		System.out.println("Podaj osob� do wrzucenia na stos ('koniec' �eby sko�czy�)");
		while(!end) {
			System.out.print("Podaj imi�: ");
			name = scan.nextLine();
			System.out.println();
			
			if(name.equals("koniec")) {
				end = true;
				break;
			}
			
			System.out.print("Podaj wzrost: ");
			height = scan.nextInt();
			scan.nextLine();
			System.out.println();
			
			System.out.println("Podaj wag�: ");
			weight = scan.nextInt();
			scan.nextLine();
			System.out.println();
			
			Parameter person = new Parameter(name, height, weight);
			arguments.push(person);
		}
		
		int limit = arguments.size();
		for(int i = 0; i < limit; i++) {
			System.out.printf("%d. %s, %d [cm], %d [kg]\n", i+1, arguments.peek().getName(), arguments.peek().getHeight(), arguments.peek().getWeight());
			arguments.pop();
		}
		
		scan.close();
		
	}
}
