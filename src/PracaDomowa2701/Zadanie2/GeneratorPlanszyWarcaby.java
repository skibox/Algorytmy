package PracaDomowa2701.Zadanie2;

public class GeneratorPlanszyWarcaby {
	public static void main(String[] args) {
		char[][] plansza = new char[8][8];
		
		for (int i = 0; i < plansza.length; i++) {
			for (int j = 0; j < plansza.length; j++) {
				plansza[i][j] = 'x';
			}
		}
		
		for (int i = 0; i < plansza.length; i++) {
			for (int j = 0; j < plansza[i].length; j++) {
				if ((i + j)%2 != 0 && i < plansza[i].length / 2 - 1) {
					plansza[i][j] = 'C';
				}
				else if ((i + j)%2 != 0 && i > plansza[i].length / 2) {
					plansza[i][j] = 'B';
				}
			}
		}
		
		for (int i = 0; i < plansza.length; i++) {
			for (int j = 0; j < plansza.length; j++) {
				System.out.print(plansza[i][j] + " ");
			}
			System.out.println();
		}
	}
}
