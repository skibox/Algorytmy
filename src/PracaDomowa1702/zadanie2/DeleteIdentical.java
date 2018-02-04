package PracaDomowa1702.zadanie2;

import java.util.ArrayList;

public class DeleteIdentical {
	public static void main(String[] args) {
		String input = "2 [2,2,2,3,4,2,4]";
		ArrayList<Integer> list = new ArrayList<>();

		int toDelete = Integer.parseInt(input.substring(0, 1));
		String trimmedInput = input.substring(input.indexOf("[") + 1, input.indexOf("]"));
		System.out.println(toDelete);
		System.out.println(input);

		String[] padded = trimmedInput.split(",");
		
		for (int i = 0; i < padded.length; i++) {
			list.add(Integer.parseInt(padded[i]));
		}
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == toDelete) {
				list.remove(i);
				i--;
			}
		}
		System.out.println("============");
		System.out.println(list.toString());
		
	}
}
