package Lista3.zadanie7;

public class USA {
	public static void stars6() {
		System.out.print("* * * * * * ");
	}

	public static void stars5() {
		System.out.print(" * * * * *  ");
	}

	public static void bars34() {
		for (int i = 0; i < 34; i++) {
			System.out.print("=");
		}
		System.out.println();
	}

	public static void bars46() {
		for (int i = 0; i < 46; i++) {
			System.out.print("=");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		for (int i = 0; i < 15; i++) {
			if (i < 9 && i % 2 != 0) {
				stars5();
				bars34();
			} else if (i < 9 && i % 2 == 0) {
				stars6();
				bars34();
			} else
				bars46();

		}
	}
}
