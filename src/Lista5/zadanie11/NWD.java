package Lista5.zadanie11;

public class NWD {
	public static int NWDc(int a, int b) {

		while (true) {
			if (a == b) {
				return a;
			} else {
				if (a < b) {
					b = b - a;
				} else {
					a = a - b;
				}
			}
		}

	}
}
