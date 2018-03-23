package Zajecia1103.KlasyWew.zadanko;

import java.util.ArrayList;
import java.util.Comparator;

public class Compare {
	
	public static void main(String[] args) {
		String[] napisy = {"NapisDluuuuuuuuugi", "NapisKroootki", "Napisek", "NapisNajdluuuuuuuuuuuuuuuzszy"};
		ArrayList<String> lista = new ArrayList<String>();
		
		for (int i = 0; i < napisy.length; i++) {
			lista.add(napisy[i]);
		}
		
		lista.sort(new Comparator<String>() {
			@Override
			public int compare(String s2, String s1) {
				if(s2.length() > s1.length()) return 1;
				else if(s2.length() < s1.length()) return -1;
				else return 0;
			}
		});
		
		for (String string : lista) {
			System.out.println(string);
		}
	}
}
