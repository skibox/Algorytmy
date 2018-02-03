package PracaDomowa2701.Zadanie4;

public class InterpretacjaTekstu {
	public static void main(String[] args) {
		String kuba 	= "ABCDABCD";
		String zenek 	= "ABABABAB";
		String bogdan 	= "CDABBAAD";
		
		int zenekPossiblePointCount 	= 0;
		int bogdanPossiblePointCount 	= 0;
		
		for (int i = 0; i < kuba.length(); i++) {
			if(kuba.toCharArray()[i] != zenek.toCharArray()[i])
				zenekPossiblePointCount++;
			if(kuba.toCharArray()[i] != bogdan.toCharArray()[i])
				bogdanPossiblePointCount++;
		}
		
		System.out.printf("Zenek (max): %d, Bogdan (max): = %d\n", 
				zenekPossiblePointCount, bogdanPossiblePointCount);
		System.out.printf("Łącznie: " + 
				(zenekPossiblePointCount+bogdanPossiblePointCount));
	}
}
