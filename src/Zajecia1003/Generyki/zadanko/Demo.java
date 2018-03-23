package Zajecia1003.Generyki.zadanko;

public class Demo {
	public static void main(String[] args) {
		FruitBasket<Jablko> basket1 = new FruitBasket<>();
		
//		basket1.add(new Banan());
		basket1.add(new Jablko());
		
		basket1.getFruits().get(0).obierz();
		

		
	}
}
