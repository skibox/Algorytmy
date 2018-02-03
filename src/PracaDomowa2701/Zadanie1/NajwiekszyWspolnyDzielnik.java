package PracaDomowa2701.Zadanie1;

public class NajwiekszyWspolnyDzielnik {
	public static int rek(int k, int n) {
		if(k > 0)	return rek(n%k, k);
		else 		return n;
	}
	
	public static void main(String[] args) {
		System.out.println(rek(8, 12));
	}
}
