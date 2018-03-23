package Zajecia1003.OdczytZliczanie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.TreeMap;

public class Demo {
	public static String removeAll(StringBuilder input) {
		for(int i = 0; i < input.length(); i++) {
			if((int)input.charAt(i) < 97)
				input.deleteCharAt(i);
			if((int)input.charAt(i) > 122)
				input.deleteCharAt(i);
		}
		return input.toString();

	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader bReader = new BufferedReader(new FileReader("src/Zajecia1003/Generyki/input.txt"));
		StringBuilder sBuilder = new StringBuilder();
		String line = bReader.readLine();
		
		while(line != null) {
			sBuilder.append(line.toLowerCase());
			sBuilder.append("\n");
			line = bReader.readLine();
		}
		
		String text = removeAll(sBuilder);
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		for(int i = 0; i < text.length() - 1; i++) {
			String znak = text.substring(i, i + 1);
			if(!treeMap.containsKey(znak)) {
				treeMap.put(znak, 1);
			}
			treeMap.put(znak, treeMap.get(znak) + 1);
		}
		
		for(String znak : treeMap.keySet())
			System.out.println((int)znak.charAt(0) + ": " + treeMap.get(znak));
		
		for(String znak : treeMap.keySet())
			System.out.println(znak + ": " + treeMap.get(znak));
		
	}
}
