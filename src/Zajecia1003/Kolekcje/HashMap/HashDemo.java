package Zajecia1003.Kolekcje.HashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class HashDemo {
	public static void main(String[] args) {
		
		//Hashmap

	       HashMap<String, String> hashMap = new HashMap<>();
	       hashMap.put(null,"test");
	       hashMap.put("Test", null);
	       hashMap.put(null,null);

	       //TreeMap - nie mozna null klucza lub wartosci
	       TreeMap<String, String> treeMap = new TreeMap<>();
	       hashMap.put(null,"test");
	       hashMap.put("test",null);
	       hashMap.put(null,null);

	       //HashTable - nie mozna null klucza lub wartosci
	       Hashtable<String, String> hashTable = new Hashtable<>();
	       hashTable.put(null,"test");
	       hashTable.put("test",null);
	       hashTable.put(null,null);
	}
}
