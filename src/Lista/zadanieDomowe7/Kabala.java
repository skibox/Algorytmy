package Lista.zadanieDomowe7;

import java.util.HashMap;

public class Kabala {
	public static void main(String[] args) {
		HashMap<Character, Integer> kabalDate = new HashMap<>();
		kabalDate.put('A', 1);
		kabalDate.put('B', 2);
		kabalDate.put('C', 3);
		kabalDate.put('D', 4);
		kabalDate.put('E', 5);
		kabalDate.put('F', 6);
		kabalDate.put('G', 7);
		kabalDate.put('H', 8);
		kabalDate.put('I', 9);
		kabalDate.put('K', 10);
		kabalDate.put('L', 20);
		kabalDate.put('M', 30);
		kabalDate.put('N', 40);
		kabalDate.put('O', 50);
		kabalDate.put('P', 60);
		kabalDate.put('Q', 70);
		kabalDate.put('R', 80);
		kabalDate.put('S', 90);
		kabalDate.put('T', 100);
		kabalDate.put('V', 200);
		kabalDate.put('X', 300);
		kabalDate.put('Y', 400);
		kabalDate.put('Z', 500);
		
		String input = "MISKA";
		char[] inputChars = input.toCharArray();
		int output = 0;
	
		for(int i = 0; i < inputChars.length; i++) {
			output += kabalDate.get(inputChars[i]);
		}
		
		System.out.printf(input + " = %d", output);
		
	}
}
