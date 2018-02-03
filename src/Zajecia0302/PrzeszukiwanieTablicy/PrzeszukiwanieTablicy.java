package Zajecia0302.PrzeszukiwanieTablicy;

import java.util.Scanner;

public class PrzeszukiwanieTablicy {
	public static void main(String[] args) {
		
		int pickedNumber;
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj wartości: ");
		String input = scan.nextLine();
		boolean end = false;
		int indexNumber = 0; 
		
		pickedNumber = Integer.parseInt(input.substring(0, 1));
		input = input.substring(input.indexOf("[") +1, input.indexOf("]"));
		String[] inputSplit= input.split(",");
		int[] val = new int[inputSplit.length];
		
		for (int i = 0; i < val.length; i++) {
			val[i] = Integer.parseInt(inputSplit[i]);
		}
		
		while(!end) {
			for (int i = val.length / 2; i < val.length - 1; i++) {
				if(val[i] == pickedNumber) {
					indexNumber = i;
					end = true;
					break;
				}
				
				if (end == true) break;
			}
			
			for (int i = val.length / 2; i >= 0; i--) {
				if(val[i] == pickedNumber) {
					indexNumber = i;
					end = true;
					break;
				}
			}
		}
		
		System.out.println("Index = " + indexNumber);
		scan.close();
	}
}
