package Zajecia1003.Generyki.zadanko;

import java.util.ArrayList;

public class FruitBasket<T extends Fruit> {
	private ArrayList<T> fruits;
	
	public FruitBasket() {
		fruits = new ArrayList<>();
	}
	
	public ArrayList<T> getFruits() {
		return fruits;
	}
	
	public void add(T fruit) {
		fruits.add(fruit);
	}

}
