package Lista3.zadanie11;

public class Divisors {
	public static void main(String[] args) {

		System.out.println("Liczby podzielne przez 3: ");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0)
				System.out.printf("%d ", i);
		}
		System.out.println();

		System.out.println("Liczby podzielne przez 5: ");
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0)
				System.out.printf("%d ", i);
		}
		System.out.println();

		System.out.println("Liczby podziene przez 3 i 5: ");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				System.out.printf("%d ", i);
		}
	}
}
