package Zajecia2402.Graf;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class Znajdowanie {
	public static void main(String[] args) throws Exception {
		File input = new File("./src/Zajecia2402/Graf/files/input.in");
		Scanner scan = new Scanner(input);
		HashMap<Integer, ArrayList<Integer>> neighborhood = new HashMap<>();

		String firstLine = scan.nextLine();
		int verticlesCount = Integer.parseInt(firstLine.split(" ")[0]);
		int edgesCount = Integer.parseInt(firstLine.split(" ")[1]);

		boolean[] visited = new boolean[verticlesCount];
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < verticlesCount; i++) {
			String line = scan.nextLine();
			String[] verticlesAsString = line.split(" ");
			Vector<Integer> linkedVerticles = new Vector<>();

			for (int j = 0; j < verticlesAsString.length; j++) {
				if (j % 2 == 0)
					continue;
				else
					linkedVerticles.add(Integer.parseInt(verticlesAsString[j]));
			}

			for (int j = 0; j < linkedVerticles.size(); j++) {
				if (neighborhood.containsKey(i)) {
					neighborhood.get(i).add(linkedVerticles.get(j));
				} else {
					neighborhood.put(i, new ArrayList<>());
					neighborhood.get(i).add(linkedVerticles.get(j));
				}
			}

		}
		
		int start 	= Integer.parseInt(scan.nextLine());
		int end 	= Integer.parseInt(scan.nextLine());
		
		for (Integer temp : neighborhood.keySet()) {
			String key = temp.toString();
			String value = neighborhood.get(temp).toString();
			System.out.println(key + " " + value);
		}
		
//		while( != end)
		
		
	}
}
