package PracaDomowa1702.zadanie4;

import java.util.ArrayList;
import java.util.Stack;

public class IsThisListAPalindrome {
	public static boolean isPalindrome(ArrayList<Integer> split) {
		Stack<Integer> halvedStack = new Stack<>();
		
		for(int i = 0; i < split.size()/2; i++){
			halvedStack.push(split.get(i));
		}
		
		for(int i = 0; i < 3; i++) {
			split.remove(0);
		}
		
		int i = split.size();
		while(!halvedStack.isEmpty()) {
			if(halvedStack.peek() != split.get(i)) return false;
			else {
				halvedStack.pop();
				i--;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		String inputNumbers = "1,2,3,3,2,1";
		ArrayList<Integer> stackedNumbers = new ArrayList<>();
		
		String[] splitNumbers = inputNumbers.split(",");
		
		for(int i = 0; i < splitNumbers.length; i++) {
			stackedNumbers.add(Integer.parseInt(splitNumbers[i]));
		}
		
		System.out.println(isPalindrome(stackedNumbers));
		
		
		
	}
}
